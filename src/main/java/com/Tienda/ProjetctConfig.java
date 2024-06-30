
package com.Tienda;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ProjetctConfig implements WebMvcConfigurer {
    /*Todos los siguientes metodos son para incorporar el tema de interalizacion en el proyecto */
 
    /*LocaleResolver se utiliza para crear una sesion de cambio de idioma */
    @Bean

      public LocaleResolver localeResolver(){
      var slr= new SessionLocaleResolver();
      slr.setDefaultLocale(Locale.getDefault());
      slr.setLocaleAttributeName("session.current.local");
      slr.setTimeZoneAttributeName("session.current.timezone");
      return slr;
      }
      
      /* localeChangeInterceptor se utiliza para crear un interceptor  de cambio de idioma ¨*/
    @Bean
    
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci = new LocaleChangeInterceptor();
            lci.setParamName("lang");
            return lci;
            
        
    }
    
    @Override
    
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
        
    }
    
    @Bean("messageSource")
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
    
    }
