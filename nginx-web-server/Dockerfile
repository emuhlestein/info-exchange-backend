FROM nginx:1.15.8-alpine
RUN rm /etc/nginx/nginx.conf /etc/nginx/conf.d/default.conf
COPY nginx-web-server/nginx.conf /etc/nginx
COPY nginx-web-server/index.html /usr/share/nginx/html
