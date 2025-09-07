# Instrucciones de Uso - Proyecto POO-Git-Casos

## ✅ Java Instalado Correctamente

Java 17 está instalado y funcionando en tu sistema. Puedes verificar esto ejecutando:
```bash
java -version
javac -version
```

## 🚀 Formas de Ejecutar los Programas

### Opción 1: Usar el Script Automático (Recomendado)
```bash
./ejecutar_programas.sh
```
Este script te permite:
- Compilar y ejecutar cualquier programa
- Compilar todos los programas de una vez
- Interfaz amigable con menú

### Opción 2: Comandos Manuales

#### Caso 1 - UsuarioSimple
```bash
# Compilar
javac caso1/UsuarioSimple.java

# Ejecutar
java -cp caso1 UsuarioSimple
```

#### Caso 2 - EstudianteInteractivo
```bash
# Compilar
javac caso2/EstudianteInteractivo.java

# Ejecutar
java -cp caso2 EstudianteInteractivo
```

#### Caso 3 - CuentaBancaria
```bash
# Compilar
javac caso3/CuentaBancaria.java

# Ejecutar
java -cp caso3 CuentaBancaria
```

### Opción 3: Compilar Todos de Una Vez
```bash
# Compilar todos los programas
javac caso1/UsuarioSimple.java
javac caso2/EstudianteInteractivo.java
javac caso3/CuentaBancaria.java

# Luego ejecutar cualquiera
java -cp caso1 UsuarioSimple
java -cp caso2 EstudianteInteractivo
java -cp caso3 CuentaBancaria
```

## 📁 Estructura de Archivos

Después de compilar, tendrás estos archivos:
```
POO-Git-Casos/
├── caso1/
│   ├── UsuarioSimple.java
│   └── UsuarioSimple.class
├── caso2/
│   ├── EstudianteInteractivo.java
│   ├── EstudianteInteractivo.class
│   └── Estudiante.class
├── caso3/
│   ├── CuentaBancaria.java
│   ├── CuentaBancaria.class
│   └── Cuenta.class
├── ejecutar_programas.sh
└── INSTRUCCIONES_USO.md
```


### Si hay errores de compilación
1. Verifica que estés en el directorio correcto
2. Asegúrate de que los archivos .java existan
3. Revisa la sintaxis del código

### Si hay errores de ejecución
1. Asegúrate de haber compilado primero
2. Verifica que los archivos .class existan
3. Usa la opción -cp correcta

## 📝 Notas Importantes

- Los archivos `.class` se generan automáticamente al compilar
- No edites los archivos `.class` directamente
- Si modificas un archivo `.java`, debes recompilarlo
- El archivo `.gitignore` excluye los archivos `.class` del control de versiones

## 🎯 Próximos Pasos

1. **Probar todos los programas** usando el script o comandos manuales
2. **Inicializar Git** y hacer commits (ver `ejemplo_commits_git.md`)
3. **Crear repositorio en GitHub** y subir el código
4. **Documentar el proceso** en el informe final

¡Disfruta programando en Java! 🚀
