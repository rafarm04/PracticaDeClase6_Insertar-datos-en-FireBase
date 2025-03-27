# Proyecto: Inserción de Datos en la Entidad "tiket"

## Descripción de la Actividad
Esta actividad consiste en localizar el archivo **"MyController"**, que se encuentra dentro de la carpeta **"controllers"**. Una vez ubicado, se debe agregar un **@GetMapping** que permita insertar datos en la entidad **"tiket"**.

## Campos a Insertar
Los datos que se deben insertar en la entidad **"tiket"** incluyen los siguientes campos:
- **nombre**
- **responsable**
- **fecha de entrega**

## Formato de la URL para Inserción de Datos
La inserción de los datos se ejecutará mediante una URL específica. Para esto, se debe tomar como referencia el siguiente ejemplo:

```
/ticket/{name}
```

La URL para realizar la inserción de datos deberá seguir este formato:

```
http://localhost:8080/api/ticket/BugFix123?responsible=MariaGomez&deadline=2024-10-15
```

## Comportamiento Esperado
Al acceder a la URL mencionada, el sistema debe realizar la inserción de un nuevo registro en la base de datos con los valores proporcionados en la URL.
