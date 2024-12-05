<h1>PROYECTO CONVERSOR DE MONEDAS</h1>
<h2>Objetivos:</h2>
El objetivo de este proyecto es crear un programa capaz de realizar una conversion entre distintos tipos de monedas, como por ejemplo de dolares a pesos argentinos, de pesos colombianos a dolares, etc.
<h2>API<h2>
Para tener datos actuales de conversion entre monedas se uso la siguiente API.
https://www.exchangerate-api.com/docs/standard-requests.
Y en nuestro proyecto hicimos uso del siguiente request GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP
El cual nos devolvia la tasa conversion, lo cual facilito la creacion del programa.

<h2>Clase ConversorMonedas</h2>
Se creo la clase conversorMonedas el cual tiene 2 metodos.
<h3>Metodo: convertir </h3>
Este método realiza la conversión entre dos tipos de monedas. Recibe tres argumentos: moneda inicial, moneda final y cantidad. La moneda inicial es el tipo de moneda que deseas convertir, mientras que la moneda final es el tipo de moneda a la que deseas realizar la conversión. Este método calcula el valor equivalente basándose en la cantidad proporcionada y la tasa de cambio correspondiente.
Para conseguir la tasa de conversion realizaremos un request a https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/monedaInicial/monedaFinal para obtener la tasa de conversion.
<h3>Metodo: cantidadIngresada</h3>
Este metodo simplemente lee la cantidad que deseamos convertir y devuelve ese valor como un double.
