# ChaseThePair

## Descripción
Dado un número (número A) obtén el par de números más cercano (número B y número C) provenientes de dos sets formados por números aleatorios. Cuando existen dos números provinientes de un mismo set que se encuentran a la misma distancia del resultado puede devolver cualquiera de los dos.

## Ejemplo
Dados dos sets de valores numericos (SetA y SetB)

```
SetA: [1,23,45,66,84,113,145,178,205,210,221,250,264,300]
SetB: [5,31,40,52,73,103,126,162,195,214,225,241,256,267]
```
Dado un valor numérico aleatorio (toChase) contenido dentro de los dos sets (No tiene porqué existir dentro de estos)
```
toChase: 231
WHERE toChase >= min(SetA, SetB) && toChase <= max(SetA, SetB)
```
Encontrar aquella pareja de valores numéricos más cercanos a toChase
```
Result: [221, 225]
```
### Notas
Los sets A y B pueden considerarse de la misma longitud.

Si dos valores dentro de un mismo set se encuentran a la misma distancia de toChase, cualquiera de los dos es perfectamente valido como resultado.

En caso de encontrar el valor toChase dentro del set, este es un resultado perfectamente valido.

Debe usarse el generador de sets que ofrecemos en este mísmo repositorio:
```
  ChaseThePair/resources/setsGenerator
```
El tiempo de lectura del archivo se puede obviar del total transcurrido.

Se pueden usar algoritmos de sort para ordenar los datos y sacarles partido para llegar a una solución más optima [pista].

Teniendo en cuenta los anteriores puntos notificados, todas las técnicas de programación (legales) están permitidas si con ellas conseguís un mejor tiempo.

## Requisitos
El reto ha sido desarrollado en Java8.

## Authors

- [Joaquim Codina](https://github.com/joaquimcodina)
