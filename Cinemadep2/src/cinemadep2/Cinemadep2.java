package cinemadep2;

import javax.swing.JOptionPane;

public class Cinemadep2 {

    public static boolean main(String[] args) {

//        Filme e = new Filme();
//        
//
//        e.setNome(JOptionPane.showInputDialog("Nome:"));
//        e.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Duração :")));
//        e.setClassificacao(Integer.parseInt(JOptionPane.showInputDialog("Classificação :")));
//        e.setGenero(JOptionPane.showInputDialog("Gênero:"));
//        e.setAtores(JOptionPane.showInputDialog("Atores:"));
//        
//        JOptionPane.showMessageDialog(null, e.resumo()+ " \n " + e.tipofilme());
//
//        Integer idade;
//
//       // caso der algum erro nessa parte quando o programa rodar,feche a saída e coloque para rodar novamente.
//        // na primeira vez que eu rodei deu erro, bug do netbeans
//        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
//
//        if (e.vericlassificacao(idade)== true) {
//            JOptionPane.showMessageDialog(null, "Você pode ver o Filme :");
//        } else {
//            JOptionPane.showMessageDialog(null, "Você não pode ver este FILME!!!!");
//        }
        Ator a = new Ator();

        a.setNome(JOptionPane.showInputDialog("Nome :"));
        a.setDatanasci(Integer.parseInt(JOptionPane.showInputDialog("Informe sua data de nascimento :")));
        a.setCachePfilme(Double.parseDouble(JOptionPane.showInputDialog("Informe cache por filme :")));
        a.setNacionalidade(JOptionPane.showInputDialog("Sua nacionalidade :"));
        a.setTotalfimes(Integer.parseInt(JOptionPane.showInputDialog("Total de filmes do ator :")));
        a.setFilmesNano(Integer.parseInt(JOptionPane.showInputDialog("Seu total de filmes por ano :")));
        String ganhou = JOptionPane.showInputDialog("S/N");
       // if (ganhou.equals("S")) {

       //     return a.setOscar(true);
       // } else { 
          //  return false;
        //}

        JOptionPane.showMessageDialog(null, a.resumo() );
        return false;
    }

}
