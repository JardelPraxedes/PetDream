package tela;

import entidades.anamnese_especial;
import entidades.exameFisico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class tela2 extends JFrame {
    private JPanel tela;
    private JPanel tela_fundo;
    private JPanel cabecalho;
    private JButton finalizar;
    private JTextField s_respiratorio;
    private JTextField s_cardiovascular;
    private JTextField s_urinario;
    private JTextField s_reprodutor;
    private JTextField s_locomotor;
    private JTextField s_neorologico;
    private JTextField postura;
    private JTextField tr;
    private JTextField linfo;
    private JTextField ocular;
    private JTextField oral;
    private JTextField vulvar;
    private JTextField anal;
    private JTextField fr;
    private JTextField pulso;
    private JTextField fc;
    private JTextField tpc;
    private JTextField consciencia;
    private JTextField escore;
    private JTextField hidratacao;
    private JTextField escapulares;
    private JTextField popliteos;
    private JTextField inguinais;
    private JTextField olhos;
    private JTextField pele;
    private JTextField s_digestorio;

    public tela2 () {
        setContentPane(tela);
        setVisible(true);
        setSize(1500, 1900);
        setTitle("Responsável");
        finalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); //fechar janela da tela 2

                anamnese_especial animal = new anamnese_especial();
                exameFisico animal1 = new exameFisico();

                animal.setSisUrinario(s_urinario.getText());
                animal.setSisRespiratorio(s_respiratorio.getText());
                animal.setSisReprodutorio(s_reprodutor.getText());
                animal.setSisDisgetorio(s_digestorio.getText());
                animal.setSisCardiovascular(s_cardiovascular.getText());
                animal.setSisLocomotor(s_locomotor.getText());
                animal.setSisNeurologico(s_neorologico.getText());
                animal.setOlhos(olhos.getText());
                animal.setPeleAnexo(pele.getText());

                animal1.setPostura(postura.getText());
                animal1.setFc(Integer.parseInt(fc.getText()));
                animal1.setFr(Integer.parseInt(fr.getText()));
                animal1.setEscoreCorporal(escore.getText());
                animal1.setHidratacao(Integer.parseInt(hidratacao.getText()));
                animal1.setLinfInguinais(inguinais.getText());
                animal1.setLinfonodoSubmandibular(linfo.getText());
                animal1.setLinfPopliteo(popliteos.getText());
                animal1.setMucosaAnal(anal.getText());
                animal1.setMucosaOcular(ocular.getText());
                animal1.setMucosaPeniana_vulvar(vulvar.getText());
                animal1.setNivelConsciencia(consciencia.getText());
                animal1.setMucosaOral(oral.getText());
                animal1.setPulso(Integer.parseInt(pulso.getText()));
                animal1.setTpc(Integer.parseInt(tpc.getText()));
                animal1.setTr(Double.parseDouble(tr.getText()));
                animal1.setLinfPreEscapulares(escapulares.getText());

                System.out.println("Sistema urinário: " + animal.getSisUrinario());
                System.out.println("Sistema respiratório : " + animal.getSisRespiratorio());
                System.out.println("Sistema reprodutório: " + animal.getSisReprodutorio());
                System.out.println("Sistema digestório: " + animal.getSisDisgetorio());
                System.out.println("Sistema cardiovascular: " + animal.getSisCardiovascular());
                System.out.println("Sistema locomotor: " + animal.getSisLocomotor());
                System.out.println("Sistema neurologico: " + animal.getSisNeurologico());
                System.out.println("Sistema olhos: " + animal.getOlhos());
                System.out.println("Sistema Pele e anexos: " + animal.getPeleAnexo());

                System.out.println("Postura: " + animal1.getPostura(postura.getText()));
                System.out.println("FC: " + animal1.getFc());
                System.out.println("FR " + animal1.getFr());
                System.out.println("Escore corporal " + animal1.getEscoreCorporal());
                System.out.println("Hidratação: " + animal1.getHidratacao());
                System.out.println("Linf.Inguinais: " + animal1.getLinfInguinais());
                System.out.println("Linf.Submandibular: " + animal1.getLinfonodoSubmandibular());
                System.out.println("Lif.Popliteo: " + animal1.getLinfPopliteo());
                System.out.println("Mucosa anal: " + animal1.getMucosaAnal());
                System.out.println("Mucosa ocular: " + animal1.getMucosaOcular());
                System.out.println("Mucosa peniana vulvar: " + animal1.getMucosaPeniana_vulvar());
                System.out.println("Mucosa oral: " + animal1.getMucosaOral());
                System.out.println("Nivel de consciencia: " + animal1.getNivelConsciencia());
                System.out.println("Pulso: " + animal1.getPulso());
                System.out.println("TPC: " + animal1.getTpc());
                System.out.println("TR: " + animal1.getTr());
                System.out.println("Linf.Pre escapulares: " + animal1.getLinfPreEscapulares());


            }

        });
    }
}