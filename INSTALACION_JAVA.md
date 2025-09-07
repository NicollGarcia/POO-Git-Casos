# Instalación de Java por Sistema Operativo

## 🍎 macOS

### Instalación con Homebrew:
```bash
# Instalar Java 17
brew install openjdk@17

# Configurar PATH
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc

# Verificar instalación
java -version
javac -version
```

### Si aparece "command not found: java":
```bash
# Recargar la configuración del shell
source ~/.zshrc

# O exportar manualmente
export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"
```

## 🪟 Windows

### Instalación:
1. Descargar JDK 17 desde [Oracle](https://www.oracle.com/java/technologies/downloads/) o [OpenJDK](https://adoptium.net/)
2. Ejecutar el instalador
3. Seguir las instrucciones del instalador

### Configuración en Git Bash:
```bash
# Exportar PATH manualmente
export PATH="/c/Program Files/Java/jdk-17/bin:$PATH"

# Verificar instalación
java -version
javac -version
```

### Configuración en PowerShell:
```powershell
# Exportar PATH
$env:PATH = "C:\Program Files\Java\jdk-17\bin;" + $env:PATH

# Verificar instalación
java -version
javac -version
```

## 🐧 Linux (Ubuntu/Debian)

### Instalación:
```bash
# Actualizar paquetes
sudo apt update

# Instalar Java 17
sudo apt install openjdk-17-jdk

# Verificar instalación
java -version
javac -version
```

### Si aparece "command not found: java":
```bash
# Exportar PATH manualmente
export PATH="/usr/lib/jvm/java-17-openjdk/bin:$PATH"

# O agregar al .bashrc
echo 'export PATH="/usr/lib/jvm/java-17-openjdk/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc
```

## 🔧 Comandos Universales

Una vez instalado Java, estos comandos funcionan en todos los sistemas:

```bash
# Compilar programa Java
javac archivo.java

# Ejecutar programa Java
java archivo

# Ver versión de Java
java -version

# Ver versión del compilador
javac -version
```

## 📋 Verificación de Instalación

Para verificar que Java está instalado correctamente:

```bash
# Debería mostrar algo como:
# openjdk version "17.0.x" 2024-xx-xx
# OpenJDK Runtime Environment (build 17.0.x+x)
# OpenJDK 64-Bit Server VM (build 17.0.x+x, mixed mode, sharing)
java -version

# Debería mostrar algo como:
# javac 17.0.x
javac -version
```

## 🚨 Solución de Problemas Comunes

### Error: "java: command not found"
- **macOS**: Verificar que Homebrew instaló Java correctamente
- **Windows**: Verificar que Java está en el PATH del sistema
- **Linux**: Verificar que el paquete openjdk-17-jdk está instalado

### Error: "javac: command not found"
- Asegúrate de instalar el JDK (Java Development Kit), no solo el JRE
- Verifica que el PATH incluye el directorio bin del JDK

### Error de permisos en Linux:
```bash
# Dar permisos de ejecución
chmod +x ejecutar_programas.sh
```

---

*Este archivo proporciona instrucciones de instalación de Java para los principales sistemas operativos utilizados en desarrollo.*
