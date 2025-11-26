
# 1.4 Java Testing - Nivel 1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto contiene la implementación de tres ejercicios de la Tasca 04 - Testing con JUnit 5.

### Ejercicio 1: Gestión de Biblioteca

**Tests implementados (8):**
- Verificar que la lista no es nula
- Confirmar tamaño de la lista después de insertar libros
- Asegurar que un libro está en su posición correcta
- Verificar que no hay títulos duplicados
- Recuperar el título de un libro por posición
- Confirmar que añadir un libro modifica la lista
- Verificar que eliminar un libro disminuye el tamaño
- Asegurar que la lista permanece ordenada alfabéticamente

### Ejercicio 2: Cálculo de la letra del DNI
Implementa el algoritmo oficial del Ministerio del Interior de España para calcular la letra del DNI español basado en el módulo 23.

**Test parametrizado:**
- Validación de 10 DNIs predefinidos usando `@ParameterizedTest` y `@CsvSource`

### Ejercicio 3: Gestión de excepciones
Crea una clase que lance `ArrayIndexOutOfBoundsException` y verifica su correcto funcionamiento mediante tests JUnit.

---

## 💻 Tecnologías Utilizadas

- **Java 17** 
- **IntelliJ IDEA** - Entorno de desarrollo integrado
- **Git** - Control de versiones
- **JUnit 5 (Jupiter)** - Framework de testing
  - `@Test` - Tests unitarios
  - `@ParameterizedTest` - Tests parametrizados
  - `@CsvSource` - Fuente de datos para tests parametrizados
- **Java Collections Framework**:
  - `ArrayList`
  - `Comparator`

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas:

- **Java Development Kit (JDK) 17** o superior
- **IntelliJ IDEA** (Community o Ultimate) o cualquier otro IDE compatible con Java
- **JUnit 5** (incluido en el proyecto)
- **Git** para clonar el repositorio

---

## 🛠️ Instalación

### 1. Clonar el repositorio
```bash
git clone https://github.com/hmirodski/1.4-Java_language-nivell1.git
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Selecciona `File` → `Open`
3. Navega hasta la carpeta del proyecto y selecciónala
4. Click en `OK`

### 3. Verificar la configuración del JDK


---

## ▶️ Ejecución

### Ejercicio 1: Biblioteca (Library Management)

**Ejecutar la aplicación:**
1. Navega a `src/exercici1/Main.java`
2. Haz clic derecho sobre el archivo
3. Selecciona `Run 'Main.main()'`
4. Observa la salida en la consola

**Ejecutar los tests:**
1. Navega a `tests/LibraryTests.java`
2. Haz clic derecho sobre el archivo
3. Selecciona `Run 'LibraryTests'`


### Ejercicio 2: Cálculo DNI

**Ejecutar los tests:**
1. Navega a `tests/CalculateDniTest.java`
2. Haz clic derecho sobre el archivo
3. Selecciona `Run 'CalculateDniTest'`
4. Observa los resultados: **10/10 tests pasando**
5. Verifica que cada DNI se valida correctamente con su letra correspondiente

### Ejercicio 3: ArrayIndexOutOfBoundsException

**Ejecutar los tests:**
1. Navega a `tests/ArrayExceptionTest.java`
2. Haz clic derecho sobre el archivo
3. Selecciona `Run 'ArrayExceptionTest'`
4. Observa los resultados: **1/1 test pasando**

### Ejecutar todos los tests del proyecto

1. Haz clic derecho sobre la carpeta `tests`
2. Selecciona `Run 'All Tests'`
3. Observa los resultados: **19/19 tests pasando**



---

##  Tests Implementados

### Ejercicio 1 - LibraryTests (8 tests)
1. `bookListIsNotNull()` - Verifica que la lista no es nula
2. `listSize()` - Verifica el tamaño de la lista
3. `correctIndex()` - Verifica posición correcta de libros
4. `noDuplicates()` - Verifica prevención de duplicados
5. `titlesByIndex()` - Verifica recuperación por posición
6. `modifiedList()` - Verifica modificación al añadir
7. `decreasedListSize()` - Verifica disminución al eliminar
8. `sortedList()` - Verifica ordenación alfabética

### Ejercicio 2 - CalculateDniTest (10 tests parametrizados)
Test parametrizado que valida 10 DNIs diferentes:
- 12345678 → Z
- 0 → T
- 1 → R
- 99999999 → R
- 12345679 → S
- 87654321 → X
- 11111111 → H
- 22222222 → J
- 33333333 → P
- 44444444 → A

### Ejercicio 3 - ArrayExceptionTest 
1. `testIndexOutOfBounds()` - Verifica que se lanza `ArrayIndexOutOfBoundsException`

---


## 🌐 Despliegue

Este proyecto es una aplicación de consola local y no requiere despliegue en un servidor. Está diseñado para ejecutarse en un entorno local con fines educativos y de aprendizaje de testing en Java.

---

## 🤝 Contribuciones

Este es un proyecto educativo personal desarrollado como parte del bootcamp de **IT Academy - Barcelona Activa**.

---

