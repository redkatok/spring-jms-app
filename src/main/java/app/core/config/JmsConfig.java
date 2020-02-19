package app.core.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfig {
//
//    private String brokerUrl = "tcp://localhost:61616";
//    private String userName = "admin";
//    private String password = "admin";
//
//
//    @Bean
//    public ActiveMQConnectionFactory connectionFactory() {
//        ActiveMQConnectionFactory factory = connectionFactory();
//        factory.setUserName(brokerUrl);
//        factory.setPassword(userName);
//        factory.setBrokerURL(password);
//        return factory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate() {
//        JmsTemplate template = new JmsTemplate();
//        template.setConnectionFactory(connectionFactory());
//        template.setPubSubDomain(true);
//        return template;
//    }
//
//    @Bean
//    public DefaultJmsListenerContainerFactory containerFactory() {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory());
//        factory.setConcurrency("1-1");
//        factory.setPubSubDomain(true);
//        return factory;
//    }

}
