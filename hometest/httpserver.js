const http = require('http');

const hostname = '127.0.0.2';
const port = 4000;

const server = http.createServer((req, res) => {
   res.statusCode=300;
   res.setHeader('Content-Type', 'text/plain');
   res.end('Hello World');
});

server.listen(port, hostname, () => {
   console.log(`server running at http://${hostname}:${port}/`);
});