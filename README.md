# API Spec

## Authentication

All API must use this authentication

Request :
- Header :
    - X-Api-Key : "Your Secret API Key"

## Create Product

Request :
- method : POST
- Endpoint : `/api/products`
- Header : 
    - Content-Type : application/json
    - Accept : application/json
- Body :

```json
{
  "id" : "string, unique",
  "name" : "string",
  "price" : "long",
  "quantity" : "integer" 
}
```

- Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date", 
      "updatedAt" : "date"
  }
}
```

## Get Product

Request :
- method : GET
- Endpoint : `/api/products/{id_product)`
- Header : 
    - Accept : application/json

- Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date", 
      "updatedAt" : "date"
  }
}
```

## Update Product

Request :
- method : PUT
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Content-Type : application/json
    - Accept : application/json
- Body :

```json
{
  "name" : "string",
  "price" : "long",
  "quantity" : "integer" 
}
```

- Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date", 
      "updatedAt" : "date"
  }
}
```

## List Product

Request :
- method : GET
- Endpoint : `/api/products`
- Header : 
    - Accept : application/json
- Query Param :
    - size : number,
    - page : number,

- Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date", 
      "updatedAt" : "date"
    }, {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date", 
      "updatedAt" : "date"
    }
  ]
}
```

## Delete Product

Request :
- method : DELETE
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Accept : application/json

- Response :

```json
{
  "code" : "number",
  "status" : "string"
}
```