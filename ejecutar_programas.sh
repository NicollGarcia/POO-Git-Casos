#!/bin/bash

# Script para compilar y ejecutar los programas Java del proyecto POO-Git-Casos


echo "=== SCRIPT DE EJECUCIÓN DE PROGRAMAS JAVA ==="
echo ""

# Función para mostrar el menú
mostrar_menu() {
    echo "Selecciona el programa que deseas ejecutar:"
    echo "1. Caso 1 - UsuarioSimple (Lectura de datos con Scanner)"
    echo "2. Caso 2 - EstudianteInteractivo (Clase con encapsulación)"
    echo "3. Caso 3 - CuentaBancaria (Sistema bancario con validaciones)"
    echo "4. Compilar todos los programas"
    echo "5. Salir"
    echo ""
    echo -n "Ingresa tu opción (1-5): "
}

# Función para compilar un programa
compilar_programa() {
    local directorio=$1
    local archivo=$2
    echo "Compilando $archivo..."
    javac $directorio/$archivo.java
    if [ $? -eq 0 ]; then
        echo "✅ $archivo compilado exitosamente"
    else
        echo "❌ Error al compilar $archivo"
        return 1
    fi
}

# Función para ejecutar un programa
ejecutar_programa() {
    local directorio=$1
    local clase=$2
    echo "Ejecutando $clase..."
    echo "----------------------------------------"
    java -cp $directorio $clase
    echo "----------------------------------------"
    echo "Programa finalizado. Presiona Enter para continuar..."
    read
}

# Bucle principal
while true; do
    clear
    mostrar_menu
    read opcion
    
    case $opcion in
        1)
            echo ""
            compilar_programa "caso1" "UsuarioSimple"
            if [ $? -eq 0 ]; then
                ejecutar_programa "caso1" "UsuarioSimple"
            fi
            ;;
        2)
            echo ""
            compilar_programa "caso2" "EstudianteInteractivo"
            if [ $? -eq 0 ]; then
                ejecutar_programa "caso2" "EstudianteInteractivo"
            fi
            ;;
        3)
            echo ""
            compilar_programa "caso3" "CuentaBancaria"
            if [ $? -eq 0 ]; then
                ejecutar_programa "caso3" "CuentaBancaria"
            fi
            ;;
        4)
            echo ""
            echo "Compilando todos los programas..."
            compilar_programa "caso1" "UsuarioSimple"
            compilar_programa "caso2" "EstudianteInteractivo"
            compilar_programa "caso3" "CuentaBancaria"
            echo ""
            echo "✅ Todos los programas compilados"
            echo "Presiona Enter para continuar..."
            read
            ;;
        5)
            echo ""
            echo "¡Gracias por usar el script!"
            exit 0
            ;;
        *)
            echo ""
            echo "❌ Opción inválida. Por favor, selecciona una opción del 1 al 5."
            echo "Presiona Enter para continuar..."
            read
            ;;
    esac
done
