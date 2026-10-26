

# Projeto de árvores em Java

### Nome: Lucas Palaro Brandão
#### Foi implementado o primeiro método, CountLeaves(), o qual retorna a quantidade de folhas que uma árvore possui.
#### O método possui 3 condicionais:
 * Verifica se a raiz está vazia, caso se estiver, retorna 0
 * Caso o nó esquerdo e o direito estejam vazios, significa que esse nó em específico é uma folha, sendo assim, retornará 1
 * Caso não entre em nenhuma das condicionais acima, o método fará uma chamada recursiva para os lado esquerdo e direito do nó em questão

   ```java
       public int countLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return  1;
        }
        else
            return  countLeaves(root.left) + countLeaves(root.right);
    }
   ```
