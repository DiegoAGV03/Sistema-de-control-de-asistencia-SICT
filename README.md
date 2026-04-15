# Sistema de control de asistencia SICT

# ***Resumen ejecutivo***

# Descripción  
Este proyecto consiste en el desarrollo de un sistema de control de asistencia que permite procesar la información de empleados a partir de archivos de entrada en formato .txt.  
El objetivo principal es automatizar el control de horarios de entrada y salida, reduciendo errores manuales y facilitando el manejo de la información por parte del area administrativa.  

El sistema toma como base dos archivos principales: uno con los datos de los empleados y otro con registros biométricos, y a partir de estos genera un nuevo archivo procesado que puede ser utilizado por el área de nómina.  

# Problema identificado  
Actualmente el control de asistencia en algunas organizaciones se realiza de manera manual o semi automatizada, lo que puede provocar:

- Errores en el registro de horarios  
- Falta de control en retardos o salidas anticipadas  
- Procesos lentos al momento de generar reportes  
- Dificultad para integrar la información con nómina  

# Solución  
Se propone un sistema desarrollado en Java que automatiza la lectura, procesamiento y generación de información de asistencia, permitiendo:

- Procesar registros de empleados automaticamente  
- Detectar retardos, salidas tempranas y horas extra  
- Generar archivos listos para el área de nómina  
- Reducir errores humanos

# Arquitectura
La solución se basa en una arquitectura simple orientada a procesamiento de archivos:

- Entrada: Archivos .txt (empleados y biométrico)
- Procesamiento: Aplicación en Java (NetBeans)
- Salida: Archivo .txt con resultados
# Flujo del sistema: <img width="876" height="1045" alt="image" src="https://github.com/user-attachments/assets/35057000-7841-4af2-b0ad-ccc259d96997" />

# ***Requerimientos***

# Infraestructura  
- Computadora personal  
- Sistema operativo Windows  
- Entorno de desarrollo NetBeans  

# Software  
- Java JDK (versión 8 o superior)  
- NetBeans IDE  
- Git (opcional para control de versiones)  

# Paquetes adicionales  
- Librerías estándar de Java para manejo de archivos  
- No se utilizan frameworks externos  

# ***Instalación***

# Clonar repositorio  
```bash
git clone https://github.com/DIEGOAGV03/Sistema-de-control-de-asistencia-SICT.git
cd Sistema-de-control-de-asistencia-SICT
```
 # Abrir proyecto

- Abrir NetBeans
- Seleccionar “Abrir proyecto”
- Elegir la carpeta del repositorio

# Ejecutar programa

- Ejecutar el proyecto desde NetBeans
- Verificar que los archivos .txt estén en la ruta correcta


# ***Configuración***

# Archivos principales

**datosEmpleados.txt** contiene:
- Número de empleado
- Nombre
- Horario de entrada
- Horario de salida

**biometrico.txt** contiene:
- Hora de llegada
- Hora de salida
- Retardos
- Horas extra

# Archivo de salida

El sistema genera un archivo .txt con la fecha del día en el que se ejecuta, el cual incluye:

- Registro procesado de asistencia  
- Incidencias detectadas  
- Información lista para nómina  

# ***Uso***

# Usuario final

El usuario puede:

- Ejecutar el programa  
- Procesar los archivos de entrada  
- Obtener el archivo de salida con los resultados  

# Flujo de uso

- Colocar los archivos requeridos en la carpeta del proyecto  
- Ejecutar el programa  
- Esperar el procesamiento  
- Revisar el archivo generado

# ***Contribución***

En caso de que alguien quiera contribuir a este proyecto, se puede seguir un flujo básico de trabajo utilizando Git y GitHub.

Primero se debe clonar el repositorio en la computadora local y posteriormente crear una nueva rama para trabajar sobre algún cambio o mejora. Esto permite no afectar directamente la versión principal del proyecto.

Una vez realizados los cambios necesarios, se guardan mediante commits y se suben al repositorio remoto. Después, se puede crear un Pull Request para integrar esos cambios al proyecto principal.

Finalmente, los cambios pueden ser revisados antes de ser aceptados, lo que ayuda a mantener un mejor control del código y evitar errores.

Este proceso permite que el desarrollo del proyecto sea más organizado y similar a un entorno de trabajo real.

# ***Roadmap***

Como mejoras futuras para este sistema, se consideran las siguientes ideas:

- Implementar una interfaz gráfica para facilitar su uso  
- Integrar una base de datos para almacenar la información de forma más estructurada  
- Generar reportes en otros formatos como PDF o Excel  
- Mejorar las validaciones de los datos de entrada  
- Automatizar completamente el proceso sin intervención manual  

Estas mejoras permitirían que el sistema sea más completo y funcional en un entorno real.
