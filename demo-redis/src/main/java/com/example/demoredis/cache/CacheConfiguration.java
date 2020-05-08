package com.example.demoredis.cache;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class CacheConfiguration {
    @Bean
    public RedisTemplate<String, Stock> stockTemplate(RedisConnectionFactory redisConnectionFactory, Jackson2JsonRedisSerializer<Stock> jackson2JsonRedisSerializer) {
        RedisTemplate<String, Stock> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        // 键的序列化
        template.setKeySerializer(new StringRedisSerializer());
        // 值的序列化
        template.setValueSerializer(jackson2JsonRedisSerializer);
        // 哈希值序列化
        template.setHashValueSerializer(jackson2JsonRedisSerializer);
        // 哈希键列化
        template.setHashKeySerializer(new StringRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public Jackson2JsonRedisSerializer<Stock> jackson2JsonRedisSerializer() {
        Jackson2JsonRedisSerializer<Stock> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Stock.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        return jackson2JsonRedisSerializer;
    }
}
