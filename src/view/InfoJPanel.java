/** ***************************************************************************************
 * Autora: Esther de Santana Araújo e Ariana de Jesus Santos Pereira
 * Componente Curricular: MI-Programação
 * Concluido em: 08/02/2019
 * Declaro que este código foi elaborado por nós de forma individual e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de livros e
 * apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
 * de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
 * do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
 ***************************************************************************************** */
package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JRadioButton;
import model.Carro;
import roteirização.Controller;

/**
 *
 * @author Esther Araújp e Ariana Pereira
 */
public class InfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InfoJPanel
     */
    public InfoJPanel() {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
    }
    public void grupoBotoes(List<Carro> carros, Controller controller) {
        
        jRadioButton1.addActionListener(new ActionListener(){
            Carro carro = carros.get(0);
            Controller ctrl = controller;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea1.setText(carro.toString());
                ctrl.setCarroSelecionado(carro);
            }
        });
        jRadioButton2.addActionListener(new ActionListener(){
            Carro carro = carros.get(1);
            Controller ctrl = controller;
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea1.setText(carro.toString());
                ctrl.setCarroSelecionado(carro);
            }
        });
        jRadioButton3.addActionListener(new ActionListener(){
            Carro carro = carros.get(2);
            Controller ctrl = controller;
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea1.setText(carro.toString());
                ctrl.setCarroSelecionado(carro);
            }
        });
        jRadioButton4.addActionListener(new ActionListener(){
            Carro carro = carros.get(3);
            Controller ctrl = controller;
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea1.setText(carro.toString());
                ctrl.setCarroSelecionado(carro);
            }
        });
        jRadioButton1.doClick();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Escolha o veículo");
        jPanel1.add(jTextField1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jRadioButton1.setText("Carro 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 0);
        jPanel2.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("Carro 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        jPanel2.add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setText("Carro 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 7, 0);
        jPanel2.add(jRadioButton3, gridBagConstraints);

        jRadioButton4.setText("Carro 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        jPanel2.add(jRadioButton4, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
