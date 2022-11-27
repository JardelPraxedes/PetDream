package tela;

import entidades.anamnese_geral;
import entidades.animal;
import entidades.ficha;
import entidades.responsavel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame{
    private JPanel tela;
    private JPanel tela_fundo;
    private JPanel cabecalho;
    private JButton avancar;
    private JTextField tela1_nome;
    private JTextField tela1_cpf;
    private JTextField tela1_telefone;
    private JTextField tela1_endereco;
    private JTextField tela1_cidade;
    private JTextField tela1_uf;
    private JTextField tela1_rg;
    private JTextField tela1_data;
    private JTextField tela1_procedencia;
    private JTextField tela1_pelagem;
    private JTextField tela1_sexo;
    private JTextField tela1_animal_idade;
    private JTextField tela1_peso;
    private JTextField tela1_animal_nome;
    private JTextField tela1_especie;
    private JTextField tela1_raca;
    private JTextField tela1_queixa;
    private JTextField tela1_historico;
    private JTextField tela1_contactantes;
    private JTextField tela1_alimentacao;
    private JTextField tela1_vacinacao;
    private JTextField tela1_vermifucacao;
    private JTextField id_ficha;
    private JTextField ambiente_vive;
    private JTextField tela1_ambiente;

    public frame (){
        setContentPane(tela);
        setVisible(true);
        setSize(1500, 1900);
        setTitle("Responsável");
        avancar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela2 tela2 = new tela2();
                dispose(); //fecha tela
                responsavel usuario = new responsavel();
                ficha usuario1 = new ficha();
                animal usuario2 = new animal();
                anamnese_geral usuario3 = new anamnese_geral();

                usuario.setNome(tela1_nome.getText());
                usuario.setCpf(tela1_cpf.getText());
                usuario.setEndereco(tela1_endereco.getText());
                usuario.setTelefone(tela1_telefone.getText());
                usuario.setCidade(tela1_cidade.getText());
                usuario.setUf(tela1_uf.getText());
                usuario1.setRg(tela1_rg.getText());
                usuario1.setData(tela1_data.getText());
                usuario1.setIdFicha(Integer.parseInt(id_ficha.getText()));
                usuario2.setEspecie(tela1_especie.getText());
                usuario2.setIdade(tela1_animal_idade.getText());
                usuario2.setNome(tela1_animal_nome.getText());
                usuario2.setPeso(tela1_peso.getText());
                usuario2.setPelagem(tela1_pelagem.getText());
                usuario2.setSexo(tela1_sexo.getText());
                usuario2.setRaca(tela1_raca.getText());
                usuario2.setProcedencia(tela1_procedencia.getText());
                usuario3.setAlimentacao(tela1_alimentacao.getText());
                usuario3.setContactante(tela1_contactantes.getText());
                usuario3.setAmbienteVive(ambiente_vive.getText());
                usuario3.setHistoricoPrincipal(tela1_historico.getText());
                usuario3.setVacinacao(tela1_vacinacao.getText());
                usuario3.setQueixaPrincipal(tela1_queixa.getText());
                usuario3.setVermifugacao(tela1_vermifucacao.getText());

                System.out.println("----------------------------------------");
                System.out.println("Numeração ficha: " + usuario1.getIdFicha());
                System.out.println("Data: " + usuario1.getData());
                System.out.println("Cliente: " + usuario.getNome());
                System.out.println("CPF: " + usuario.getCpf());
                System.out.println("RG: " + usuario1.getRg());
                System.out.println("Endereço: " + usuario.getEndereco());
                System.out.println("Telefone " + usuario.getTelefone());
                System.out.println("Cidade: " + usuario.getCidade());
                System.out.println("UF: " + usuario.getUf());
                System.out.println("----------------------------------------");
                System.out.println("Nome animal: " + usuario2.getNome());
                System.out.println("idade: " + usuario2.getIdade());
                System.out.println("Peso: " + usuario2.getPeso());
                System.out.println("especie: " + usuario2.getEspecie());
                System.out.println("Procedência: " + usuario2.getProcedencia());
                System.out.println("Pelagem: " + usuario2.getPelagem());
                System.out.println("Sexo: " + usuario2.getSexo());
                System.out.println("Raça: " + usuario2.getRaca());
                System.out.println("Contactantes: " + usuario3.getContactante());
                System.out.println("Alimentação: " + usuario3.getAlimentacao());
                System.out.println("Ambiente que vive: " + usuario3.getAmbienteVive());
                System.out.println("Histórico principal " + usuario3.getHistoricoPrincipal());
                System.out.println("Queixa principal: " + usuario3.getQueixaPrincipal());
                System.out.println("Vacinação: " + usuario3.getVacinacao());
                System.out.println("Vermifugação: " + usuario3.getVermifugacao());


            }

        });

    }

}
