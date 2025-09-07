# Guía de Primeros Pasos con Git

## ¿Qué es Git?

Git es un sistema de control de versiones distribuido que permite rastrear cambios en archivos y coordinar el trabajo entre múltiples desarrolladores. Es esencial para el desarrollo de software moderno.

## Instalación de Git

### En Windows:
1. Descarga Git desde [git-scm.com](https://git-scm.com/)
2. Ejecuta el instalador y sigue las instrucciones
3. Verifica la instalación abriendo Git Bash y ejecutando: `git --version`

### En macOS:
```bash
# Usando Homebrew
brew install git

# O descarga desde git-scm.com
```

### En Linux (Ubuntu/Debian):
```bash
sudo apt update
sudo apt install git
```

## Configuración Inicial

Antes de usar Git, configura tu identidad:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@ejemplo.com"
```

Verifica la configuración:
```bash
git config --list
```

## Conceptos Básicos

### Repositorio
Un repositorio es un directorio que contiene todos los archivos de tu proyecto y el historial de cambios.

### Commit
Un commit es una "fotografía" del estado de tu proyecto en un momento específico.

### Rama (Branch)
Una rama es una línea de desarrollo independiente que permite trabajar en características sin afectar la rama principal.

## Comandos Esenciales

### 1. Inicializar un Repositorio

```bash
# Crear un nuevo repositorio
git init

# Clonar un repositorio existente
git clone https://github.com/usuario/repositorio.git
```

### 2. Navegación Básica

```bash
# Ver el estado del repositorio
git status

# Ver el historial de commits
git log

# Ver el historial de forma compacta
git log --oneline

# Ver cambios en archivos
git diff
```

### 3. Primer Commit

```bash
# Agregar archivos al área de staging
git add archivo.java
git add .  # Agregar todos los archivos

# Crear un commit
git commit -m "Mensaje descriptivo del cambio"

# Ejemplo
git commit -m "Agregar clase UsuarioSimple con Scanner"
```

### 4. Trabajar con Ramas

```bash
# Crear una nueva rama
git branch nombre-rama

# Cambiar a una rama
git checkout nombre-rama

# Crear y cambiar a una nueva rama
git checkout -b nueva-rama

# Ver todas las ramas
git branch

# Ver ramas remotas
git branch -r
```

### 5. Fusionar Ramas

```bash
# Cambiar a la rama principal
git checkout main

# Fusionar otra rama
git merge nombre-rama

# Eliminar una rama después de fusionar
git branch -d nombre-rama
```

### 6. Trabajar con Repositorios Remotos

```bash
# Agregar un repositorio remoto
git remote add origin https://github.com/usuario/repositorio.git

# Ver repositorios remotos
git remote -v

# Subir cambios al repositorio remoto
git push origin main

# Descargar cambios del repositorio remoto
git pull origin main
```

## Flujo de Trabajo Básico

### 1. Trabajo Diario
```bash
# 1. Verificar estado
git status

# 2. Agregar cambios
git add .

# 3. Crear commit
git commit -m "Descripción del cambio"

# 4. Subir cambios
git push origin main
```

### 2. Trabajo con Ramas
```bash
# 1. Crear rama para nueva característica
git checkout -b nueva-caracteristica

# 2. Hacer cambios y commits
git add .
git commit -m "Implementar nueva característica"

# 3. Cambiar a rama principal
git checkout main

# 4. Fusionar cambios
git merge nueva-caracteristica

# 5. Subir cambios
git push origin main
```

## Mejores Prácticas

### Mensajes de Commit
- Usa mensajes descriptivos y claros
- Usa el imperativo ("Agregar" no "Agregué")
- Limita la primera línea a 50 caracteres
- Ejemplos:
  - ✅ `git commit -m "Agregar validación de saldo en CuentaBancaria"`
  - ❌ `git commit -m "cambios"`

### Frecuencia de Commits
- Haz commits frecuentes y pequeños
- Cada commit debe representar un cambio lógico
- No acumules muchos cambios en un solo commit

### Estructura de Ramas
- `main`: Rama principal con código estable
- `develop`: Rama de desarrollo
- `feature/nombre`: Ramas para nuevas características
- `bugfix/nombre`: Ramas para corrección de errores

## Comandos Útiles Adicionales

```bash
# Ver historial con gráfico
git log --graph --oneline --all

# Deshacer el último commit (mantener cambios)
git reset --soft HEAD~1

# Ver diferencias entre commits
git diff commit1 commit2

# Crear un tag para una versión
git tag -a v1.0 -m "Versión 1.0"

# Ver archivos ignorados
git status --ignored
```

## Archivo .gitignore

Crea un archivo `.gitignore` para excluir archivos que no deben ser versionados:

```gitignore
# Archivos compilados de Java
*.class
*.jar
*.war

# Directorios de IDE
.idea/
.vscode/
*.iml

# Archivos del sistema
.DS_Store
Thumbs.db

# Logs
*.log
```

## Resolución de Conflictos

Cuando Git no puede fusionar automáticamente:

1. Abre el archivo con conflictos
2. Busca las marcas de conflicto:
   ```
   <<<<<<< HEAD
   Código de la rama actual
   =======
   Código de la rama que se está fusionando
   >>>>>>> nombre-rama
   ```
3. Edita el archivo para resolver el conflicto
4. Elimina las marcas de conflicto
5. Agrega el archivo: `git add archivo.java`
6. Completa la fusión: `git commit`

## Recursos Adicionales

- [Documentación oficial de Git](https://git-scm.com/doc)
- [GitHub Learning Lab](https://lab.github.com/)
- [Atlassian Git Tutorials](https://www.atlassian.com/git/tutorials)

## Comandos de Referencia Rápida

| Comando | Descripción |
|---------|-------------|
| `git init` | Inicializar repositorio |
| `git clone <url>` | Clonar repositorio |
| `git add <archivo>` | Agregar archivo al staging |
| `git commit -m "mensaje"` | Crear commit |
| `git status` | Ver estado del repositorio |
| `git log` | Ver historial |
| `git branch` | Ver ramas |
| `git checkout <rama>` | Cambiar rama |
| `git merge <rama>` | Fusionar rama |
| `git push origin <rama>` | Subir cambios |
| `git pull origin <rama>` | Descargar cambios |

---

*Esta guía cubre los conceptos básicos de Git necesarios para comenzar a trabajar con control de versiones en proyectos de programación.*
