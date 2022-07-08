FROM ubuntu
RUN apt-get -y update && apt-get -y install nginx
RUN rm /etc/nginx/nginx.conf /etc/nginx/conf.d/default.conf
COPY nginx-web-server/nginx.conf /etc/nginx
COPY nginx-web-server/index.html /usr/share/nginx/html
EXPOSE 80/tcp
CMD ["/use/sbin/nginx", "-g", "daemon off;"]