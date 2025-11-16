# Demo de Testing — ISO2

Este repositorio ofrece un ejemplo simple de cómo estructurar y ejecutar un proyecto Maven con pruebas unitarias en **JUnit 4**, generación de informes con **Surefire** y **JaCoCo**, y organización de ramas según el flujo recomendado en la asignatura.
Sirve como **material de apoyo** para la práctica de *Testing* de Ingeniería del Software II (ISO2).

---

## 🌿 Ramas del repositorio

* **main** → rama estable, contiene solo el código y los tests (sin carpeta `target/`).
* **developer** → rama de trabajo para el desarrollo del código.
* **hotfix** → rama destinada a la ejecución de pruebas e informes; aquí sí se guarda la carpeta `target/` generada por Maven.

---

## 🚀 Cómo importar y probar en Eclipse

1. **Clonar el repositorio**

   ```bash
   git clone git@github.com:jaredgs93/triangulo-testing-demo.git
   ```

2. **Importar en Eclipse**

   * `File → Import…`
   * `Maven → Existing Maven Projects`
   * Seleccionar la carpeta del proyecto
   * *Finish*

3. **Ejecutar pruebas**

   * `Run As → Maven test`
   * (Opcional) `Run As → JUnit Test`

4. **Generar informes de cobertura**

   ```bash
   mvn jacoco:report
   mvn site
   ```

   Abrir:

   ```
   target/site/jacoco/index.html
   ```

---

## 👥 Autores

* **Jared Guerrero**
* **Ismael Caballero**
* **Moisés Rodríguez**
