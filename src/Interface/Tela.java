/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Tela extends javax.swing.JFrame {

String Username = null, Password = null, senha = null , usuario = null;   

public Tela() {
        initComponents();
        TelaDocente.setVisible(false);
        TelaEstudante.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        loginUsuario = new javax.swing.JTextField();
        loginSenha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();
        TelaDocente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        MiniTelas = new javax.swing.JPanel();
        MiniTelaDocentes = new javax.swing.JPanel();
        TabelaDoc = new javax.swing.JScrollPane();
        TabelaDocentes = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        MiniTelaDisciplinas = new javax.swing.JPanel();
        TabelaDisc = new javax.swing.JScrollPane();
        TabelaDisciplinas = new javax.swing.JTable();
        BotaoTecEletro = new javax.swing.JRadioButton();
        BotaoTecInfo = new javax.swing.JRadioButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        MiniTelaCadastrarAluno = new javax.swing.JPanel();
        Moldura3x4 = new javax.swing.JPanel();
        Foto3x4 = new javax.swing.JLabel();
        CaixaDeTextoCadastroSenha = new javax.swing.JTextField();
        CaixaDeTextoCadastroNome = new javax.swing.JTextField();
        CaixaDeTextoCadastroUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CadastroCursoBarra = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CadastroAnoBarra = new javax.swing.JComboBox<>();
        BotaoProcurarImagem3x4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BotaoConcluirCadastro = new javax.swing.JButton();
        BotaoProcurarDocumentacao = new javax.swing.JButton();
        EnderecoFoto = new javax.swing.JTextField();
        TabelaDocumentosAnexados = new javax.swing.JScrollPane();
        ListaDocumentos = new javax.swing.JTextPane();
        CaixaDeTextoCadastroDataNasc = new javax.swing.JFormattedTextField();
        MiniTelaTurmas = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        BotaoTurmasApertado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoCadastrarAlunoApertado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotaoDisciplinasApertado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BotaoDocentesApertado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TelaEstudante = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BotaoBoletim = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        BotaoDadosPessoais = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        MiniTelasAluno = new javax.swing.JPanel();
        MiniTelaDadosPessoais = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        EditarDadosPessoais = new javax.swing.JButton();
        MiniTelaBoletim = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BotaoSair1 = new javax.swing.JButton();
        ImagemDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TelaLogin.setBackground(new java.awt.Color(255, 255, 255));
        TelaLogin.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaLogin.setOpaque(false);
        TelaLogin.setPreferredSize(new java.awt.Dimension(800, 600));
        TelaLogin.setLayout(null);

        loginUsuario.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        loginUsuario.setForeground(new java.awt.Color(204, 204, 204));
        loginUsuario.setText("Usúario");
        loginUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickMouseUsuario(evt);
            }
        });
        TelaLogin.add(loginUsuario);
        loginUsuario.setBounds(280, 244, 240, 30);

        loginSenha.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        loginSenha.setForeground(new java.awt.Color(204, 204, 204));
        loginSenha.setText("Senha");
        loginSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickMouseSenha(evt);
            }
        });
        loginSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginSenhaKeyPressed(evt);
            }
        });
        TelaLogin.add(loginSenha);
        loginSenha.setBounds(280, 290, 240, 30);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairTelaLogin(evt);
            }
        });
        TelaLogin.add(jButton2);
        jButton2.setBounds(360, 390, 72, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jButton1.setText("Acessar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        TelaLogin.add(jButton1);
        jButton1.setBounds(360, 350, 72, 24);

        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Sign up(Teacher)");
        TelaLogin.add(jLabel14);
        jLabel14.setBounds(280, 330, 100, 16);

        Título.setFont(new java.awt.Font("Algerian", 0, 65)); // NOI18N
        Título.setText("LOGIN");
        TelaLogin.add(Título);
        Título.setBounds(310, 140, 180, 60);

        Imagem.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        Imagem.setForeground(new java.awt.Color(204, 204, 204));
        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/wallpapersden.com_landscape-pixel-art_800x600.jpg"))); // NOI18N
        Imagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagemMouseClicked(evt);
            }
        });
        TelaLogin.add(Imagem);
        Imagem.setBounds(0, 0, 800, 600);

        TelaDocente.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaDocente.setOpaque(false);
        TelaDocente.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel1);
        jPanel1.setBounds(70, 60, 670, 60);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel2);
        jPanel2.setBounds(70, 120, 670, 10);

        jPanel3.setBackground(new java.awt.Color(0, 178, 109));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel3);
        jPanel3.setBounds(70, 330, 150, 190);

        MiniTelas.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelas.setLayout(null);

        MiniTelaDocentes.setBackground(new java.awt.Color(228, 255, 255));

        TabelaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente", "Disciplina ", "Ano"
            }
        ));
        TabelaDoc.setViewportView(TabelaDocentes);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pegar valor no array de disciplinas", " " }));

        jButton10.setText("Procurar");

        javax.swing.GroupLayout MiniTelaDocentesLayout = new javax.swing.GroupLayout(MiniTelaDocentes);
        MiniTelaDocentes.setLayout(MiniTelaDocentesLayout);
        MiniTelaDocentesLayout.setHorizontalGroup(
            MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDocentesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabelaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MiniTelaDocentesLayout.createSequentialGroup()
                        .addGroup(MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton10)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MiniTelaDocentesLayout.setVerticalGroup(
            MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaDocentesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(27, 27, 27)
                .addComponent(TabelaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        MiniTelas.add(MiniTelaDocentes);
        MiniTelaDocentes.setBounds(0, 0, 520, 390);

        MiniTelaDisciplinas.setBackground(new java.awt.Color(228, 255, 255));

        TabelaDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplinas", "Nº de Alunos", "Nº de professores", "Carga horária(semanal) "
            }
        ));
        TabelaDisc.setViewportView(TabelaDisciplinas);

        BotaoTecEletro.setText("Técnico em Eletromecânica");

        BotaoTecInfo.setText("Técnico em Informatica");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ano", "2º Ano", "3º Ano", "4º Ano" }));

        jLabel13.setText("Ano");

        jButton8.setText("Procurar");

        javax.swing.GroupLayout MiniTelaDisciplinasLayout = new javax.swing.GroupLayout(MiniTelaDisciplinas);
        MiniTelaDisciplinas.setLayout(MiniTelaDisciplinasLayout);
        MiniTelaDisciplinasLayout.setHorizontalGroup(
            MiniTelaDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDisciplinasLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(MiniTelaDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MiniTelaDisciplinasLayout.createSequentialGroup()
                        .addComponent(BotaoTecEletro)
                        .addGap(18, 18, 18)
                        .addGroup(MiniTelaDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MiniTelaDisciplinasLayout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(40, 40, 40))
                            .addGroup(MiniTelaDisciplinasLayout.createSequentialGroup()
                                .addComponent(BotaoTecInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        MiniTelaDisciplinasLayout.setVerticalGroup(
            MiniTelaDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaDisciplinasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MiniTelaDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoTecEletro)
                    .addComponent(BotaoTecInfo)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        MiniTelas.add(MiniTelaDisciplinas);
        MiniTelaDisciplinas.setBounds(0, 0, 520, 390);

        MiniTelaCadastrarAluno.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelaCadastrarAluno.setPreferredSize(new java.awt.Dimension(520, 390));

        Moldura3x4.setLayout(null);

        Foto3x4.setBackground(new java.awt.Color(204, 204, 204));
        Foto3x4.setMaximumSize(new java.awt.Dimension(100, 125));
        Foto3x4.setMinimumSize(new java.awt.Dimension(100, 125));
        Foto3x4.setPreferredSize(new java.awt.Dimension(100, 125));
        Moldura3x4.add(Foto3x4);
        Foto3x4.setBounds(0, 0, 90, 125);

        jLabel7.setText("Nome");

        jLabel8.setText(" Usuario");

        jLabel9.setText("Senha");

        CadastroCursoBarra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Técnico em Informática", "Técnico em Eletromecânica" }));

        jLabel10.setText("Curso");

        CadastroAnoBarra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ano", "2º Ano", "3º Ano", "4º Ano" }));

        BotaoProcurarImagem3x4.setText("Adicionar Imagem.png (3x4)");
        BotaoProcurarImagem3x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarImagem3x4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Data de Nascimento");

        jLabel12.setText("Ano Letivo");

        BotaoConcluirCadastro.setText("Cadastrar");
        BotaoConcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroActionPerformed(evt);
            }
        });

        BotaoProcurarDocumentacao.setText("Adiconar Documentação(até 10MB)");
        BotaoProcurarDocumentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarDocumentacaoActionPerformed(evt);
            }
        });

        EnderecoFoto.setText(" ");

        TabelaDocumentosAnexados.setViewportView(ListaDocumentos);

        try {
            CaixaDeTextoCadastroDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout MiniTelaCadastrarAlunoLayout = new javax.swing.GroupLayout(MiniTelaCadastrarAluno);
        MiniTelaCadastrarAluno.setLayout(MiniTelaCadastrarAlunoLayout);
        MiniTelaCadastrarAlunoLayout.setHorizontalGroup(
            MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CaixaDeTextoCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(CadastroAnoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CadastroCursoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaDeTextoCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(CaixaDeTextoCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaixaDeTextoCadastroDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoProcurarImagem3x4)
                            .addComponent(EnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(BotaoConcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TabelaDocumentosAnexados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoProcurarDocumentacao))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(Moldura3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        MiniTelaCadastrarAlunoLayout.setVerticalGroup(
            MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiniTelaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastroAnoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastroCursoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(MiniTelaCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(Moldura3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProcurarImagem3x4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TabelaDocumentosAnexados, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoProcurarDocumentacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoConcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        MiniTelas.add(MiniTelaCadastrarAluno);
        MiniTelaCadastrarAluno.setBounds(0, 0, 520, 390);

        MiniTelaTurmas.setBackground(new java.awt.Color(228, 255, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ti-A", "1º Ti-B", "2º Ti-A", "2º Ti-B", "3º Ti-A", "3º Ti-B", "4º Ti-A", "4º Ti-B", " ", " ", " ", " ", " " }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Unidade ", "2º Unidade ", "3º Unidade ", "4º Unidade " }));

        jRadioButton1.setText("Técnico em Eletromecânica");

        jRadioButton2.setText("Técnico em Informatica");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alunos", "Situação", "Nota "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton9.setText("Procurar");

        javax.swing.GroupLayout MiniTelaTurmasLayout = new javax.swing.GroupLayout(MiniTelaTurmas);
        MiniTelaTurmas.setLayout(MiniTelaTurmasLayout);
        MiniTelaTurmasLayout.setHorizontalGroup(
            MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaTurmasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MiniTelaTurmasLayout.createSequentialGroup()
                        .addGroup(MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MiniTelaTurmasLayout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addGroup(MiniTelaTurmasLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MiniTelaTurmasLayout.setVerticalGroup(
            MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaTurmasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(MiniTelaTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        MiniTelas.add(MiniTelaTurmas);
        MiniTelaTurmas.setBounds(0, 0, 510, 390);

        TelaDocente.add(MiniTelas);
        MiniTelas.setBounds(220, 130, 520, 390);

        BotaoTurmasApertado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoTurmasApertado(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(105, 160, 115));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("       Turmas");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout BotaoTurmasApertadoLayout = new javax.swing.GroupLayout(BotaoTurmasApertado);
        BotaoTurmasApertado.setLayout(BotaoTurmasApertadoLayout);
        BotaoTurmasApertadoLayout.setHorizontalGroup(
            BotaoTurmasApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoTurmasApertadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoTurmasApertadoLayout.setVerticalGroup(
            BotaoTurmasApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoTurmasApertadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TelaDocente.add(BotaoTurmasApertado);
        BotaoTurmasApertado.setBounds(70, 130, 150, 50);

        BotaoCadastrarAlunoApertado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoCadastrarAlunoApertado(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(105, 160, 115));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("       Cadastrar Aluno");
        jLabel4.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarAlunoApertadoLayout = new javax.swing.GroupLayout(BotaoCadastrarAlunoApertado);
        BotaoCadastrarAlunoApertado.setLayout(BotaoCadastrarAlunoApertadoLayout);
        BotaoCadastrarAlunoApertadoLayout.setHorizontalGroup(
            BotaoCadastrarAlunoApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(BotaoCadastrarAlunoApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoCadastrarAlunoApertadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BotaoCadastrarAlunoApertadoLayout.setVerticalGroup(
            BotaoCadastrarAlunoApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BotaoCadastrarAlunoApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoCadastrarAlunoApertadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TelaDocente.add(BotaoCadastrarAlunoApertado);
        BotaoCadastrarAlunoApertado.setBounds(70, 180, 150, 50);

        jLabel6.setBackground(new java.awt.Color(105, 160, 115));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("        Disciplinas ");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoDisciplinasApertadoLayout = new javax.swing.GroupLayout(BotaoDisciplinasApertado);
        BotaoDisciplinasApertado.setLayout(BotaoDisciplinasApertadoLayout);
        BotaoDisciplinasApertadoLayout.setHorizontalGroup(
            BotaoDisciplinasApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoDisciplinasApertadoLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BotaoDisciplinasApertadoLayout.setVerticalGroup(
            BotaoDisciplinasApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoDisciplinasApertadoLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TelaDocente.add(BotaoDisciplinasApertado);
        BotaoDisciplinasApertado.setBounds(70, 230, 150, 50);

        BotaoDocentesApertado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoDocentesApertado(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(105, 160, 115));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("        Docentes");
        jLabel5.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel5.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout BotaoDocentesApertadoLayout = new javax.swing.GroupLayout(BotaoDocentesApertado);
        BotaoDocentesApertado.setLayout(BotaoDocentesApertadoLayout);
        BotaoDocentesApertadoLayout.setHorizontalGroup(
            BotaoDocentesApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(BotaoDocentesApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDocentesApertadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BotaoDocentesApertadoLayout.setVerticalGroup(
            BotaoDocentesApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BotaoDocentesApertadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDocentesApertadoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TelaDocente.add(BotaoDocentesApertado);
        BotaoDocentesApertado.setBounds(70, 280, 150, 50);

        BotaoSair.setText("SAIR");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        TelaDocente.add(BotaoSair);
        BotaoSair.setBounds(700, 550, 72, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Point Blur_Nov142022_191653.jpg"))); // NOI18N
        TelaDocente.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        TelaEstudante.setMaximumSize(new java.awt.Dimension(800, 600));
        TelaEstudante.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaEstudante.setOpaque(false);
        TelaEstudante.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 178, 109));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel6);
        jPanel6.setBounds(70, 230, 150, 290);

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel5);
        jPanel5.setBounds(70, 120, 670, 10);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel4);
        jPanel4.setBounds(70, 60, 670, 60);

        BotaoBoletim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoBoletim(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(105, 160, 115));
        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("       Boletim");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout BotaoBoletimLayout = new javax.swing.GroupLayout(BotaoBoletim);
        BotaoBoletim.setLayout(BotaoBoletimLayout);
        BotaoBoletimLayout.setHorizontalGroup(
            BotaoBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoBoletimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoBoletimLayout.setVerticalGroup(
            BotaoBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoBoletimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TelaEstudante.add(BotaoBoletim);
        BotaoBoletim.setBounds(70, 130, 150, 50);

        BotaoDadosPessoais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoDadosPessoais(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(105, 160, 115));
        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("      Dados Pessoais");
        jLabel16.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel16.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel16.setOpaque(true);

        javax.swing.GroupLayout BotaoDadosPessoaisLayout = new javax.swing.GroupLayout(BotaoDadosPessoais);
        BotaoDadosPessoais.setLayout(BotaoDadosPessoaisLayout);
        BotaoDadosPessoaisLayout.setHorizontalGroup(
            BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDadosPessoaisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BotaoDadosPessoaisLayout.setVerticalGroup(
            BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDadosPessoaisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TelaEstudante.add(BotaoDadosPessoais);
        BotaoDadosPessoais.setBounds(70, 180, 150, 50);

        MiniTelasAluno.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelasAluno.setLayout(null);

        MiniTelaDadosPessoais.setBackground(new java.awt.Color(228, 255, 255));

        jLabel17.setText("Nome");

        jLabel20.setText("Curso");

        jLabel21.setText("Data de Nascimento");

        jLabel22.setText("Ano Letivo");

        EditarDadosPessoais.setText("Editar");
        EditarDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDadosPessoaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MiniTelaDadosPessoaisLayout = new javax.swing.GroupLayout(MiniTelaDadosPessoais);
        MiniTelaDadosPessoais.setLayout(MiniTelaDadosPessoaisLayout);
        MiniTelaDadosPessoaisLayout.setHorizontalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(90, 90, 90)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(EditarDadosPessoais)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        MiniTelaDadosPessoaisLayout.setVerticalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel21)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addGap(138, 138, 138)
                .addComponent(EditarDadosPessoais)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        MiniTelasAluno.add(MiniTelaDadosPessoais);
        MiniTelaDadosPessoais.setBounds(0, 0, 520, 390);

        MiniTelaBoletim.setBackground(new java.awt.Color(228, 255, 255));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ano", "2º Ano", "3º Ano", "4º Ano" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Disciplinas", "Unidades ", "Média"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout MiniTelaBoletimLayout = new javax.swing.GroupLayout(MiniTelaBoletim);
        MiniTelaBoletim.setLayout(MiniTelaBoletimLayout);
        MiniTelaBoletimLayout.setHorizontalGroup(
            MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaBoletimLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MiniTelaBoletimLayout.setVerticalGroup(
            MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaBoletimLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        MiniTelasAluno.add(MiniTelaBoletim);
        MiniTelaBoletim.setBounds(0, 0, 510, 390);

        TelaEstudante.add(MiniTelasAluno);
        MiniTelasAluno.setBounds(220, 130, 520, 390);

        BotaoSair1.setText("SAIR");
        BotaoSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSair1ActionPerformed(evt);
            }
        });
        TelaEstudante.add(BotaoSair1);
        BotaoSair1.setBounds(700, 550, 72, 23);

        ImagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Point Blur_Nov142022_191653.jpg"))); // NOI18N
        TelaEstudante.add(ImagemDeFundo);
        ImagemDeFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickMouseUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouseUsuario
      loginUsuario.setText(null);
     loginUsuario.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
     loginUsuario.setForeground(new java.awt.Color(0, 0, 0));
     
    }//GEN-LAST:event_ClickMouseUsuario
    
    private void ImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagemMouseClicked
        if(loginUsuario.getText()== null){      
       loginUsuario.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        loginUsuario.setForeground(new java.awt.Color(204, 204, 204));
        loginUsuario.setText("Usúario");
        }
        if(loginSenha.getText() == null){
         loginSenha.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        loginSenha.setForeground(new java.awt.Color(204, 204, 204));
        loginSenha.setText("Senha");
    }//GEN-LAST:event_ImagemMouseClicked
    }
    private void ClickMouseSenha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouseSenha
          loginSenha.setText(null);
         loginSenha.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
     loginSenha.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_ClickMouseSenha

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Username = loginUsuario.getText();
        Password = loginSenha.getText();    
        
        if((Username.contains("abc")|| Username.equals(usuario)) 
            && (Password.contains("123") || Password.equals(senha))){
        loginUsuario.setText(null);
        loginSenha.setText(null);
        TelaLogin.setVisible(false);
        TelaEstudante.setVisible(true);
        //TelaDocente.setVisible(true);
    }
        if(Username.contains("def") && Password.contains("456")){//Procurar na lista de Professores
        loginUsuario.setText(null);
        loginSenha.setText(null);
        TelaLogin.setVisible(false);
        
        TelaDocente.setVisible(true);
        LimparMiniTela();
        //TelaEstudante.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void LimparMiniTela(){
        MiniTelaTurmas.setVisible(false);
        MiniTelaCadastrarAluno.setVisible(false);
        MiniTelaDisciplinas.setVisible(false);
        MiniTelaDocentes.setVisible(false);
        MiniTelaDadosPessoais.setVisible(false);
        MiniTelaBoletim.setVisible(false);
          
    }
    private void BotaoSairTelaLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairTelaLogin
      System.exit(0); 
    }//GEN-LAST:event_BotaoSairTelaLogin

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        TelaDocente.setVisible(false);
        TelaLogin.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void loginSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginSenhaKeyPressed
       getRootPane().setDefaultButton(jButton1); // TODO add your handling code here:
    }//GEN-LAST:event_loginSenhaKeyPressed

    private void ClickNoBotaoTurmasApertado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoTurmasApertado
       LimparMiniTela();
        MiniTelaTurmas.setVisible(true);
    }//GEN-LAST:event_ClickNoBotaoTurmasApertado

    private void ClickBotaoCadastrarAlunoApertado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoCadastrarAlunoApertado
       LimparMiniTela(); 
MiniTelaCadastrarAluno.setVisible(true);

    }//GEN-LAST:event_ClickBotaoCadastrarAlunoApertado

    private void ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDisciplinas
       LimparMiniTela();
MiniTelaDisciplinas.setVisible(true);// TODO add your handling code here:
PreencherTabelaDisciplinas();
    }//GEN-LAST:event_ClickBotaoDisciplinas

    private void ClickBotaoDocentesApertado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDocentesApertado
LimparMiniTela();
        MiniTelaDocentes.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoDocentesApertado

    private void ClickNoBotaoBoletim(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoBoletim
        LimparMiniTela();
        MiniTelaBoletim.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_ClickNoBotaoBoletim

    private void ClickBotaoDadosPessoais(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDadosPessoais
        LimparMiniTela();
        MiniTelaDadosPessoais.setVisible(true);

    }//GEN-LAST:event_ClickBotaoDadosPessoais

    private void EditarDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDadosPessoaisActionPerformed
       
    }//GEN-LAST:event_EditarDadosPessoaisActionPerformed

    private void BotaoSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSair1ActionPerformed
        TelaEstudante.setVisible(false);
        TelaLogin.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BotaoSair1ActionPerformed

    private void BotaoProcurarDocumentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarDocumentacaoActionPerformed
        JFileChooser arquivo = new JFileChooser();
        int op = arquivo.showOpenDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){
            File file = new File("");
            file = arquivo.getSelectedFile();
            String nomedoarquivo = file.getName();
         ListaDocumentos.setText(nomedoarquivo);

    }//GEN-LAST:event_BotaoProcurarDocumentacaoActionPerformed
    }
    
    private void BotaoConcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroActionPerformed
        String nome = CaixaDeTextoCadastroNome.getText();
                String data = CaixaDeTextoCadastroDataNasc.getText();
                //CadastroAnoBarra
                       // CadastroCursoBarra.get
                         usuario = CaixaDeTextoCadastroUsuario.getText();
                             senha = CaixaDeTextoCadastroSenha.getText();
                            Icon foto = Foto3x4.getIcon();
    }//GEN-LAST:event_BotaoConcluirCadastroActionPerformed

    private void BotaoProcurarImagem3x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarImagem3x4ActionPerformed
        JFileChooser arquivofoto = new JFileChooser();
        int op = arquivofoto.showOpenDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){
            File file = new File("");
            file = arquivofoto.getSelectedFile();
            String endereco = file.getAbsolutePath();

            ImageIcon imagem = new ImageIcon(file.getPath());
            EnderecoFoto.setText(endereco);
            Foto3x4.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(Foto3x4.getWidth(), Foto3x4.getHeight(),Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_BotaoProcurarImagem3x4ActionPerformed
    
    public void PreencherTabelaDisciplinas(){
  
    DefaultTableModel dtmDisciplinas = (DefaultTableModel) TabelaDisciplinas.getModel();
    String j = "Geografia", n = "12",  m= "2", k=  "4 horas";
    Object dados [] = {j, n , m , k };//usar o comando this. para cada atributo de disciplina(qtd de alunos, caga horaria,etc.)
    dtmDisciplinas.addRow(dados);  
}
public void MarcadorPressionado(){
   /*if(BotaoTecEletro.getSelectedIcon()){
       
   }*/
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoBoletim;
    private javax.swing.JPanel BotaoCadastrarAlunoApertado;
    private javax.swing.JButton BotaoConcluirCadastro;
    private javax.swing.JPanel BotaoDadosPessoais;
    private javax.swing.JPanel BotaoDisciplinasApertado;
    private javax.swing.JPanel BotaoDocentesApertado;
    private javax.swing.JButton BotaoProcurarDocumentacao;
    private javax.swing.JButton BotaoProcurarImagem3x4;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoSair1;
    private javax.swing.JRadioButton BotaoTecEletro;
    private javax.swing.JRadioButton BotaoTecInfo;
    private javax.swing.JPanel BotaoTurmasApertado;
    private javax.swing.JComboBox<String> CadastroAnoBarra;
    private javax.swing.JComboBox<String> CadastroCursoBarra;
    private javax.swing.JFormattedTextField CaixaDeTextoCadastroDataNasc;
    private javax.swing.JTextField CaixaDeTextoCadastroNome;
    private javax.swing.JTextField CaixaDeTextoCadastroSenha;
    private javax.swing.JTextField CaixaDeTextoCadastroUsuario;
    private javax.swing.JButton EditarDadosPessoais;
    private javax.swing.JTextField EnderecoFoto;
    private javax.swing.JLabel Foto3x4;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel ImagemDeFundo;
    private javax.swing.JTextPane ListaDocumentos;
    private javax.swing.JPanel MiniTelaBoletim;
    private javax.swing.JPanel MiniTelaCadastrarAluno;
    private javax.swing.JPanel MiniTelaDadosPessoais;
    private javax.swing.JPanel MiniTelaDisciplinas;
    private javax.swing.JPanel MiniTelaDocentes;
    private javax.swing.JPanel MiniTelaTurmas;
    private javax.swing.JPanel MiniTelas;
    private javax.swing.JPanel MiniTelasAluno;
    private javax.swing.JPanel Moldura3x4;
    private javax.swing.JScrollPane TabelaDisc;
    private javax.swing.JTable TabelaDisciplinas;
    private javax.swing.JScrollPane TabelaDoc;
    private javax.swing.JTable TabelaDocentes;
    private javax.swing.JScrollPane TabelaDocumentosAnexados;
    private javax.swing.JPanel TelaDocente;
    private javax.swing.JPanel TelaEstudante;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel Título;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField loginSenha;
    private javax.swing.JTextField loginUsuario;
    // End of variables declaration//GEN-END:variables

    private void ClickMouseUsuario1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
