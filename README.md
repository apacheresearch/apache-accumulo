# Apache Accumulo

## Introducción

Accumulo fue creado en 2008 por un equipo de ingenieros de software de la NSA. La agencia necesitaba una base de datos que pudiera manejar grandes volúmenes de datos con controles de acceso muy granulares, algo que las soluciones existentes no ofrecían en ese momento. Inspirado en el modelo de Google Bigtable, Accumulo fue diseñado para ser altamente escalable y seguro.

## Contribución a la Apache Software Foundation

En septiembre de 2011, la NSA contribuyó con Accumulo a la Apache Software Foundation como un proyecto de incubadora. Esto permitió que la comunidad de desarrolladores comenzara a contribuir y mejorar el software. En marzo de 2012, Accumulo se graduó de la incubadora y se convirtió en un proyecto de nivel superior en Apache.

## Evolución y Características

Desde su lanzamiento como proyecto de código abierto, Accumulo ha evolucionado significativamente. Algunas de las características clave que se han añadido a lo largo del tiempo incluyen:

- **Escalabilidad**: Puede manejar petabytes de datos distribuidos en miles de servidores.
- **Seguridad**: Ofrece controles de acceso a nivel de celda, lo que permite una gestión granular de los permisos.
- **Rendimiento**: Optimizado para operaciones de lectura y escritura rápidas.
- **Integración**: Se integra bien con otras herramientas de Big Data como Apache Hadoop y Apache Spark.

## Benchmarking

En las pruebas de rendimiento, Accumulo ha demostrado ser capaz de manejar **100 millones de entradas por segundo** y **408 terabytes** de datos, incluso en presencia de fallos de hardware y sin interrupciones.

## Estado Actual

Hoy en día, Accumulo sigue siendo una herramienta poderosa y flexible para el almacenamiento y procesamiento de datos distribuidos. La comunidad de desarrolladores continúa mejorando el software, añadiendo nuevas características y optimizando su rendimiento.

## ¿Cómo Funciona?

Accumulo utiliza una arquitectura basada en tablas, donde los datos se almacenan en celdas identificadas por una fila y una columna. Cada celda puede tener múltiples versiones, lo que permite un control detallado sobre los datos.

## Cómo Empezar

### Requisitos Previos

Antes de configurar Accumulo, asegúrate de tener instalados y configurados los siguientes componentes:

- **Apache Hadoop**: Necesitarás HDFS (Hadoop Distributed File System) para el almacenamiento de datos.
- **Apache ZooKeeper**: Utilizado para la coordinación de los servicios distribuidos.
### Instalación

Descarga e instala Accumulo desde el sitio oficial de Apache:

```bash
tar xzf /path/to/accumulo-2.1.3-bin.tar.gz
cd accumulo-2.1.3
```

Configuración Inicial

Configura los archivos principales en el directorio conf/:

    accumulo.properties: Configura los procesos del servidor de Accumulo.
    accumulo-env.sh: Configura las variables de entorno.
    accumulo-client.properties: Configura las propiedades del cliente.

