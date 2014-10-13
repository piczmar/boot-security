package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
//
//    @Bean
//    public TomcatEmbeddedServletContainerFactory tomcatFactory() {
//        return new TomcatEmbeddedServletContainerFactory() {
//
//            @Override
//            protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(
//                    Tomcat tomcat) {
//                tomcat.enableNaming();
//                return super.getTomcatEmbeddedServletContainer(tomcat);
//            }
//
//            @Override
//            protected void postProcessContext(Context context) {
////                ContextResource resource = new ContextResource();
////                resource.setName("jdbc/myDataSource");
////                resource.setType(DataSource.class.getName());
////                resource.setProperty("driverClassName", "your.db.Driver");
////                resource.setProperty("url", "jdbc:yourDb");
////
////                context.getNamingResources().addResource(resource);
//            }
//        };
//    }

}