# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

**Explicacion Codigo:**
Al principio debemos validar si el nodo `root` es null para evitar errores, si es el caso retornamos un nuevo Nodo con el valor recibido. Si no es null, validamos si el valor recibido el menor (o igual) al valor del nodo, si lo es, asignamos al hijo derecho del nodo con el nodo que devuelva la clase recursiva, enviando como parametro el el hijo derecho y el valor, caso contrario hacemos los mismo pero para el hijo izquierda. Por ultimo retornamos el nodo.

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```
**Explicacion Codigo:**
El funcionamiento es parecido al metodo insert de un arbol binario. En el caso de recibir el Nodo `root` como null devolvera null. Ademas, se debe instanciar un nodo temporal del nodo derecho (o el izquierdo) llamando a la clase recursiva, despues una vez guardado una instancia temporal, en el nodo izquierda asignamos el nodo que nos devuelva la funcion recursiva enviando como nodo el derecho, y finalmente en el nodo derecho le asignamos la instancia temporal. Por  ultimo, retornamos el nodo.

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

**Explicacion Codigo:**
Al principio, instanciamos una lista de lista de nodos que contendra los niveles con los nodos. Validamos si el Nodo `root` es null, si lo es retornamos la lista vacia. Caso contrario, instanciamos una cola en la cual vamos agregar cada nodo, por lo que al inicio debemos agregar el nodo `root`. Ahora, usamos un while que se ejecuta si la cola no esta vacia, tomamos con el lenght del nivel al size de la cola, ademas de instancia una lista de nodos para el nivel actual. Haremos un for con el size obtenido, en donde en cada pasada, haremos `poll()` para obtener en ultimo y los agregamos a la lista del nivel actual. Validaremos si los hijos son nulos o no, si no lo son, los agregamos a la cola, una vez acabado el for, agregamos la lista del nivel actual a la lista de niveles instanciada al inicio del metodo. Por ultimo, retornamos la lista de niveles.

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

**Explicacion Codigo:**
Al igual que los demas metodos, empezamos validando si el nodo `root` recibido es nulo, si lo retornamos `0`, indicando que no tiene altura. Ahora, instanciamos un entero del lado izquierda y le asignamos lo que devuelva el metodo recursivo enviando como nodo el hijo izquierdo, y lo mismo para el lado izquierdo, a cada uno le sumaremos `1` para tomar en cuenta el nodo padre. Por ultimo, calculos que lado es mayor para tomarlo con altura y devolverlo.

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

