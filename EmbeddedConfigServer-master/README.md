#Sample Embedded ConfigServer

1. We have setup a sample embedded config server with postgresql database backend that loads our properties.


#KEY POINTS

1. You can find the META-INF folder attached which loads the Datasource and Jdbc Environment Repository at the start of the application.

2. Create a table named 'properties' and insert the below given queries.

CREATE TABLE public.properties
(
  application text,
  profile text,
  label text,
  key text,
  value text
)


INSERT INTO public.properties(
            application, profile, label, key, value)
 VALUES ('demo_microservice', 'jdbc', 'jdbc', 'country', 'India');
    
   -- application refers to the spring.application.name
   -- profile refers to the spring.profiles.active
   -- label refers to the label mentioned in the bootstrap.yml
   -- Key and Value Correspondingly.
   
 Once the application is up, kindly hit the following urls:
 
1. http://localhost:<port_number>/{application-name}/{profile}/{label}  --> CONFIG SERVER VALUES END POINT

2. http://localhost:<port_number>/api/message  --> REST END POINT
     
   
    