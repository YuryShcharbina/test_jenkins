FROM nginx:1.21.3-alpine
ENV TZ Europe/Minsk
RUN rm -f /etc/nginx/conf.d/default.conf
COPY sites/ /etc/nginx/conf.d/
