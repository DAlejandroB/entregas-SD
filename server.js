/*Inicialización de paqutes requeridos para crear el servidor*/
const express = require('express');
const app =  express();
/*Creación del array al cual tendrá acceso el cliente (un elemento a la vez)*/
const my_array = ['Hugo 0', 'Paco 1', 'Luis 2', 'Donald 3', 'Mickey 4'];

app.listen(5000, () => console.log('listening at 5000'));
app.get('/', (request, response) =>{
	/*Lectura del indice requerido por el cliente a traves de la query presente en la url*/
	const index = parseInt(request.query.index);
	console.log('Solicited item at: ' + index + '.');
	/*Devolución del elemento en el indice especificado*/
	response.send(my_array[index]);
});