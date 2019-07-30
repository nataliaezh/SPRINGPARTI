package Lesson1;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

        @Bean
        public MegaServiceConfig megaService() {
            return new MegaServiceConfig ("DEFAULT");
        }
        @Bean
        public MegaServiceConfig megaServiceFirst() {
            return new MegaServiceConfig ("FIRST");
        }

        @Bean
        public MegaServiceConfig megaServiceSecond() {
            return new MegaServiceConfig ("SECOND");
        }

  }


