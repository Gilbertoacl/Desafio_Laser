# Escultura a Laser

Retirado de https://br.spoj.com/problems/LASERR/

Escreva um programa que, dados a altura do bloco, o comprimento do bloco, e a forma final que o bloco deve ter, determine o número total vezes de que o laser deve ser ligado para esculpir o bloco.

### Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha de um caso de teste contém dois números inteiros A e C, separados por um espaço em branco, indicando respectivamente a altura (1≤A≤104) e o comprimento (1≤C≤104) do bloco a ser esculpido, em milímetros. A segunda linha contém C números inteiros Xi, cada um indicando a altura final, em milímetros, do bloco entre as posições i e i + 1 ao longo do comprimento (0≤Xi≤A, para 0≤i≤C - 1). Considere que a cada varredura uma camada de espessura 1 milímetro é removida do bloco ao longo dos pontos onde o laser está ligado.
O final da entrada é indicado por uma linha que contém apenas dois zeros, separados por um espaço em branco.
Os dados devem ser lidos da entrada padrão.

### Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha, contendo um numero inteiro, indicando o número de vezes que o laser deve ser ligado para esculpir o bloco na forma indicada.
O resultado de seu programa deve ser escrito na saída padrão.
Exemplo

``` sh
Entrada:
5 8
1 2 3 2 0 3 4 5
3 3
1 0 2
4 3
4 4 1
0 0

Saída:
7
3
3
```


### Execução
Criar um arquivo input.txt com as informaçoes de Altura e comprimento dos blocos a serem feitos pelo programa. 

``` sh
javac laser.java
java laser < input.text > output.txt 
diff output.txt sample.txt

```
