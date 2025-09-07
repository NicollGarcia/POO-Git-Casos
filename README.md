# POO-Git-Casos

## Descripción del Proyecto

Este repositorio contiene casos prácticos de Programación Orientada a Objetos (POO) en Java, desarrollados como parte de un trabajo académico. El proyecto incluye tres casos de estudio que demuestran conceptos fundamentales de POO y el uso de Git para control de versiones.

## Estructura del Repositorio

```
POO-Git-Casos/
├── caso1/
│   └── UsuarioSimple.java
├── caso2/
│   └── EstudianteInteractivo.java
├── caso3/
│   └── CuentaBancaria.java
├── guia_git.md
├── README.md
└── informe_final.pdf
```

## Casos Implementados

### Caso 1: Lectura de Datos Simples con Scanner
**Archivo:** `caso1/UsuarioSimple.java`

**Descripción:** Programa que demuestra el uso básico de la clase Scanner para solicitar datos por teclado al usuario.

**Características:**
- Lectura de diferentes tipos de datos (String, int, double)
- Manejo del buffer de Scanner
- Interfaz de usuario amigable
- Validación básica de entrada

**Conceptos POO aplicados:**
- Uso de clases del API de Java (Scanner)
- Método main como punto de entrada
- Manejo de entrada/salida

### Caso 2: Clase Estudiante con Atributos Privados
**Archivo:** `caso2/EstudianteInteractivo.java`

**Descripción:** Implementación de una clase Estudiante que demuestra encapsulación mediante atributos privados, constructor y métodos get/set.

**Características:**
- Clase con atributos privados (encapsulación)
- Constructor parametrizado
- Métodos getter y setter
- Método para mostrar información
- Interfaz interactiva con Scanner

**Conceptos POO aplicados:**
- Encapsulación (atributos privados)
- Constructor
- Métodos de acceso (get/set)
- Abstracción de datos
- Interacción entre clases

### Caso 3: Clase CuentaBancaria con Validación
**Archivo:** `caso3/CuentaBancaria.java`

**Descripción:** Sistema bancario básico que permite operaciones de depósito y retiro con validaciones de saldo.

**Características:**
- Operaciones bancarias básicas (depósito/retiro)
- Validación de saldo suficiente
- Validación de montos positivos
- Menú interactivo
- Manejo de errores

**Conceptos POO aplicados:**
- Encapsulación
- Validación de datos
- Métodos con retorno booleano
- Manejo de errores
- Interfaz de usuario completa

## Requisitos del Sistema

- **Java:** JDK 8 o superior
- **Git:** Para control de versiones
- **Editor de código:** Cualquier editor que soporte Java (VS Code, IntelliJ IDEA, Eclipse, etc.)

## Instrucciones de Compilación y Ejecución

### Compilar los programas:
```bash
# Caso 1
javac caso1/UsuarioSimple.java
java -cp caso1 UsuarioSimple

# Caso 2
javac caso2/EstudianteInteractivo.java
java -cp caso2 EstudianteInteractivo

# Caso 3
javac caso3/CuentaBancaria.java
java -cp caso3 CuentaBancaria
```

### Ejecutar desde la raíz del proyecto:
```bash
# Caso 1
java -cp . caso1.UsuarioSimple

# Caso 2
java -cp . caso2.EstudianteInteractivo

# Caso 3
java -cp . caso3.CuentaBancaria
```

## Conceptos de POO Demostrados

1. **Clases y Objetos**
   - Definición de clases
   - Creación de objetos
   - Instanciación

2. **Encapsulación**
   - Atributos privados
   - Métodos públicos de acceso
   - Ocultación de información

3. **Constructor**
   - Inicialización de objetos
   - Parámetros de construcción
   - Valores por defecto

4. **Métodos**
   - Métodos de acceso (get/set)
   - Métodos de operación
   - Métodos con retorno

5. **Validación de Datos**
   - Verificación de entrada
   - Manejo de errores
   - Mensajes informativos

## Uso de Git

Este proyecto incluye una guía completa de Git (`guia_git.md`) que cubre:

- Instalación y configuración inicial
- Comandos básicos (init, add, commit, status, log)
- Trabajo con ramas (branch, checkout, merge)
- Repositorios remotos (clone, push, pull)
- Mejores prácticas y flujo de trabajo

