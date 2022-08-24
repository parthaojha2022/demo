FROM ibmcom/websphere-liberty:22.0.0.8-kernel-java8-ibmjava-ubi
#COPY server.xml /config/
COPY --chown=1001:0 server.xml /config/
#USER root
#RUN chown 1001:0 /config/server.xml
#USER 1001
#COPY --from=staging /staging/lib.index.cache /lib.index.cache
COPY target/veda-itg-core-0.0.1-SNAPSHOT.war config/dropins/
EXPOSE 9080
#RUN configure.sh
#RUN installUtility install defaultServer


