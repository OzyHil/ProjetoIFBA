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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Tela extends javax.swing.JFrame {
    
    String Username = null, Password = null, senha = null, usuario = null, endereco = null, nomesdealunos = null, nomesdedisciplinas = null, nomesDeDocentes = null;
    ImageIcon imagem = null;
    int x = 210;
    String[] nomesAlunos = new String[100];
    String[] nomesDisciplinas = new String[100];    
String[] nomesDocentes = new String[100];
  
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
        jPanel7 = new javax.swing.JPanel();
        DeslizarMenu = new javax.swing.JLabel();
        PainelMenu = new javax.swing.JPanel();
        BotaoMenuCadastro = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BotaoMenuEditar = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        BotaoMenuRemover = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        BotaoMenuRelatorio = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        PainelSubmenu = new javax.swing.JPanel();
        BotaoCadastrarTurmas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotaoCadastrarDocentes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotaoCadastrarAluno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotaoCadastrarDisciplinas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BotaoEditarTurmas = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        BotaoEditarDocentes = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        BotaoEditarAluno = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        BotaoEditarDisciplinas = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        BotaoRemoverTurmas = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        BotaoRemoverAluno = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        BotaoRemoverDisciplinas = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        BotaoRemoverDocentes = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        BotaoRelatorioTurmas = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        BotaoRelatorioDocentes = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        BotaoRelatorioAluno = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        BotaoRelatorioDisciplinas = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        MiniTelas = new javax.swing.JPanel();
        CadastrarDisciplina = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CaixaDeTextoDisciplina = new javax.swing.JTextField();
        BotaoConcluirCadastroDisciplinas = new javax.swing.JButton();
        ListaDeAlunos = new javax.swing.JScrollPane();
        listadealunos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadeprofessores = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        CadastrarAluno = new javax.swing.JPanel();
        Moldura3x4 = new javax.swing.JPanel();
        Foto3x4 = new javax.swing.JLabel();
        CaixaDeTextoCadastroSenhaAluno = new javax.swing.JTextField();
        CaixaDeTextoCadastroNomeAluno = new javax.swing.JTextField();
        CaixaDeTextoCadastroUsuarioAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BotaoProcurarImagem3x4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BotaoConcluirCadastro = new javax.swing.JButton();
        BotaoProcurarDocumentacao = new javax.swing.JButton();
        EnderecoFotoAluno = new javax.swing.JTextField();
        TabelaDocumentosAnexados = new javax.swing.JScrollPane();
        ListaDocumentosAluno = new javax.swing.JTextPane();
        CaixaDeTextoCadastroDataNascAluno = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        CaixaDeTextoMatriculaAluno = new javax.swing.JTextField();
        CadastrarDocente = new javax.swing.JPanel();
        Moldura3x5 = new javax.swing.JPanel();
        Foto3x5 = new javax.swing.JLabel();
        CaixaDeTextoCadastroSenhaDocente = new javax.swing.JTextField();
        CaixaDeTextoCadastroNomeDocente = new javax.swing.JTextField();
        CaixaDeTextoCadastroUsuarioDocente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        BotaoProcurarImagem3x5 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        BotaoConcluirCadastro1 = new javax.swing.JButton();
        BotaoProcurarDocumentacao1 = new javax.swing.JButton();
        EnderecoFotoDocente = new javax.swing.JTextField();
        TabelaDocumentosAnexados1 = new javax.swing.JScrollPane();
        ListaDocumentosDocente = new javax.swing.JTextPane();
        CaixaDeTextoCadastroDataNascDocente = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        CaixaDeTextoMatriculaDocente = new javax.swing.JTextField();
        CadastrarTurma = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CaixaDeTextoCadastroTurma = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaDisciplinas = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        DisciplinasBusca = new javax.swing.JPanel();
        TabelaDisc = new javax.swing.JScrollPane();
        TabelaDisciplinas = new javax.swing.JTable();
        BotaoTecEletro = new javax.swing.JRadioButton();
        BotaoTecInfo = new javax.swing.JRadioButton();
        AnoTurmaDisciplina = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        BotaoProcurarDisciplinas = new javax.swing.JButton();
        MiniTelaDocentes = new javax.swing.JPanel();
        TabelaDoc = new javax.swing.JScrollPane();
        TabelaDocentes = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        EditarDadosPessoais = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        FotoDadosPessoais = new javax.swing.JLabel();
        NomeDoAluno = new javax.swing.JLabel();
        CursoDoAluno = new javax.swing.JLabel();
        DataNascDoAluno = new javax.swing.JLabel();
        AnoLetivoDoAluno = new javax.swing.JLabel();
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
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 60);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel2);
        jPanel2.setBounds(0, 60, 800, 10);

        jPanel3.setBackground(new java.awt.Color(0, 178, 109));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel3);
        jPanel3.setBounds(30, 270, 180, 330);

        jPanel7.setBackground(new java.awt.Color(0, 204, 153));
        jPanel7.setLayout(null);

        DeslizarMenu.setBackground(new java.awt.Color(0, 178, 109));
        DeslizarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-menu-30.png"))); // NOI18N
        DeslizarMenu.setText("B");
        DeslizarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeslizarMenuMouseClicked(evt);
            }
        });
        jPanel7.add(DeslizarMenu);
        DeslizarMenu.setBounds(0, 0, 30, 30);

        TelaDocente.add(jPanel7);
        jPanel7.setBounds(0, 70, 30, 530);

        PainelMenu.setLayout(null);

        BotaoMenuCadastro.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoMenuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoMenuCadastro(evt);
            }
        });
        BotaoMenuCadastro.setLayout(null);

        jLabel25.setBackground(new java.awt.Color(255, 102, 204));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoMenuCadastro.add(jLabel25);
        jLabel25.setBounds(20, 0, 30, 50);

        jLabel26.setBackground(new java.awt.Color(105, 160, 115));
        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("             Cadastrar");
        jLabel26.setOpaque(true);
        BotaoMenuCadastro.add(jLabel26);
        jLabel26.setBounds(0, 0, 180, 50);

        PainelMenu.add(BotaoMenuCadastro);
        BotaoMenuCadastro.setBounds(0, 0, 180, 50);

        BotaoMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoMenuEditar(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(105, 160, 115));
        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("             Editar");
        jLabel27.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel27.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel27.setOpaque(true);

        javax.swing.GroupLayout BotaoMenuEditarLayout = new javax.swing.GroupLayout(BotaoMenuEditar);
        BotaoMenuEditar.setLayout(BotaoMenuEditarLayout);
        BotaoMenuEditarLayout.setHorizontalGroup(
            BotaoMenuEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoMenuEditarLayout.setVerticalGroup(
            BotaoMenuEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMenuEditarLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelMenu.add(BotaoMenuEditar);
        BotaoMenuEditar.setBounds(0, 50, 180, 50);

        BotaoMenuRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoMenuRemover(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(105, 160, 115));
        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("             Remover");
        jLabel28.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel28.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel28.setOpaque(true);

        javax.swing.GroupLayout BotaoMenuRemoverLayout = new javax.swing.GroupLayout(BotaoMenuRemover);
        BotaoMenuRemover.setLayout(BotaoMenuRemoverLayout);
        BotaoMenuRemoverLayout.setHorizontalGroup(
            BotaoMenuRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoMenuRemoverLayout.setVerticalGroup(
            BotaoMenuRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMenuRemoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelMenu.add(BotaoMenuRemover);
        BotaoMenuRemover.setBounds(0, 100, 180, 50);

        BotaoMenuRelatorio.setPreferredSize(new java.awt.Dimension(0, 50));

        jLabel29.setBackground(new java.awt.Color(105, 160, 115));
        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("             Relatórios ");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoMenuRelatorioLayout = new javax.swing.GroupLayout(BotaoMenuRelatorio);
        BotaoMenuRelatorio.setLayout(BotaoMenuRelatorioLayout);
        BotaoMenuRelatorioLayout.setHorizontalGroup(
            BotaoMenuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoMenuRelatorioLayout.setVerticalGroup(
            BotaoMenuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMenuRelatorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelMenu.add(BotaoMenuRelatorio);
        BotaoMenuRelatorio.setBounds(0, 150, 180, 50);

        TelaDocente.add(PainelMenu);
        PainelMenu.setBounds(30, 70, 180, 200);

        PainelSubmenu.setLayout(null);

        BotaoCadastrarTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoCadastrarTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoCadastrarTurmas(evt);
            }
        });
        BotaoCadastrarTurmas.setLayout(null);

        jLabel18.setBackground(new java.awt.Color(255, 102, 204));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoCadastrarTurmas.add(jLabel18);
        jLabel18.setBounds(20, 0, 30, 50);

        jLabel3.setBackground(new java.awt.Color(105, 160, 115));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("             Turmas");
        jLabel3.setOpaque(true);
        BotaoCadastrarTurmas.add(jLabel3);
        jLabel3.setBounds(0, 0, 180, 50);

        PainelSubmenu.add(BotaoCadastrarTurmas);
        BotaoCadastrarTurmas.setBounds(0, 0, 180, 50);

        BotaoCadastrarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoCadastrarDocentes(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(105, 160, 115));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("             Docentes");
        jLabel5.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel5.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarDocentesLayout = new javax.swing.GroupLayout(BotaoCadastrarDocentes);
        BotaoCadastrarDocentes.setLayout(BotaoCadastrarDocentesLayout);
        BotaoCadastrarDocentesLayout.setHorizontalGroup(
            BotaoCadastrarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarDocentesLayout.setVerticalGroup(
            BotaoCadastrarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoCadastrarDocentesLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelSubmenu.add(BotaoCadastrarDocentes);
        BotaoCadastrarDocentes.setBounds(0, 50, 180, 50);

        BotaoCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoCadastrarAluno(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(105, 160, 115));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("             Alunos");
        jLabel4.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setLayout(BotaoCadastrarAlunoLayout);
        BotaoCadastrarAlunoLayout.setHorizontalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarAlunoLayout.setVerticalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.getAccessibleContext().setAccessibleName("       Alunos");

        PainelSubmenu.add(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setBounds(0, 100, 180, 50);

        BotaoCadastrarDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoCadastrarDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarDisciplinasMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(105, 160, 115));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("             Disciplinas ");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoCadastrarDisciplinasLayout = new javax.swing.GroupLayout(BotaoCadastrarDisciplinas);
        BotaoCadastrarDisciplinas.setLayout(BotaoCadastrarDisciplinasLayout);
        BotaoCadastrarDisciplinasLayout.setHorizontalGroup(
            BotaoCadastrarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarDisciplinasLayout.setVerticalGroup(
            BotaoCadastrarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoCadastrarDisciplinas);
        BotaoCadastrarDisciplinas.setBounds(0, 150, 180, 50);

        BotaoEditarTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoEditarTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoEditarTurmas(evt);
            }
        });
        BotaoEditarTurmas.setLayout(null);

        jLabel35.setBackground(new java.awt.Color(255, 102, 204));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoEditarTurmas.add(jLabel35);
        jLabel35.setBounds(20, 0, 30, 50);

        jLabel36.setBackground(new java.awt.Color(105, 160, 115));
        jLabel36.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("             Turmas");
        jLabel36.setOpaque(true);
        BotaoEditarTurmas.add(jLabel36);
        jLabel36.setBounds(0, 0, 180, 50);

        PainelSubmenu.add(BotaoEditarTurmas);
        BotaoEditarTurmas.setBounds(0, 0, 180, 50);

        BotaoEditarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarDocentes(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(105, 160, 115));
        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("             Docentes");
        jLabel37.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel37.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel37.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarDocentesLayout = new javax.swing.GroupLayout(BotaoEditarDocentes);
        BotaoEditarDocentes.setLayout(BotaoEditarDocentesLayout);
        BotaoEditarDocentesLayout.setHorizontalGroup(
            BotaoEditarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarDocentesLayout.setVerticalGroup(
            BotaoEditarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoEditarDocentesLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelSubmenu.add(BotaoEditarDocentes);
        BotaoEditarDocentes.setBounds(0, 50, 180, 50);

        BotaoEditarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarAluno(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(105, 160, 115));
        jLabel38.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("             Alunos");
        jLabel38.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel38.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel38.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarAlunoLayout = new javax.swing.GroupLayout(BotaoEditarAluno);
        BotaoEditarAluno.setLayout(BotaoEditarAlunoLayout);
        BotaoEditarAlunoLayout.setHorizontalGroup(
            BotaoEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarAlunoLayout.setVerticalGroup(
            BotaoEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoEditarAluno);
        BotaoEditarAluno.setBounds(0, 100, 180, 50);

        BotaoEditarDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoEditarDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoEditarDisciplinasMouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(105, 160, 115));
        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("             Disciplinas ");
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoEditarDisciplinasLayout = new javax.swing.GroupLayout(BotaoEditarDisciplinas);
        BotaoEditarDisciplinas.setLayout(BotaoEditarDisciplinasLayout);
        BotaoEditarDisciplinasLayout.setHorizontalGroup(
            BotaoEditarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarDisciplinasLayout.setVerticalGroup(
            BotaoEditarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoEditarDisciplinas);
        BotaoEditarDisciplinas.setBounds(0, 150, 180, 50);

        BotaoRemoverTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRemoverTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoRemoverTurmas(evt);
            }
        });
        BotaoRemoverTurmas.setLayout(null);

        jLabel40.setBackground(new java.awt.Color(255, 102, 204));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoRemoverTurmas.add(jLabel40);
        jLabel40.setBounds(20, 0, 30, 50);

        jLabel41.setBackground(new java.awt.Color(105, 160, 115));
        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("             Turmas");
        jLabel41.setOpaque(true);
        BotaoRemoverTurmas.add(jLabel41);
        jLabel41.setBounds(0, 0, 180, 50);

        PainelSubmenu.add(BotaoRemoverTurmas);
        BotaoRemoverTurmas.setBounds(0, 0, 180, 50);

        BotaoRemoverAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRemoverAluno(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(105, 160, 115));
        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("             Alunos");
        jLabel42.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel42.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel42.setOpaque(true);

        javax.swing.GroupLayout BotaoRemoverAlunoLayout = new javax.swing.GroupLayout(BotaoRemoverAluno);
        BotaoRemoverAluno.setLayout(BotaoRemoverAlunoLayout);
        BotaoRemoverAlunoLayout.setHorizontalGroup(
            BotaoRemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverAlunoLayout.setVerticalGroup(
            BotaoRemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRemoverAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoRemoverAluno);
        BotaoRemoverAluno.setBounds(0, 100, 180, 0);

        BotaoRemoverDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRemoverDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRemoverDisciplinasMouseClicked(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(105, 160, 115));
        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("             Disciplinas ");
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoRemoverDisciplinasLayout = new javax.swing.GroupLayout(BotaoRemoverDisciplinas);
        BotaoRemoverDisciplinas.setLayout(BotaoRemoverDisciplinasLayout);
        BotaoRemoverDisciplinasLayout.setHorizontalGroup(
            BotaoRemoverDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverDisciplinasLayout.setVerticalGroup(
            BotaoRemoverDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRemoverDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoRemoverDisciplinas);
        BotaoRemoverDisciplinas.setBounds(0, 150, 180, 50);

        BotaoRemoverDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRemoverDocentes(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(105, 160, 115));
        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("             Docentes");
        jLabel44.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel44.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel44.setOpaque(true);

        javax.swing.GroupLayout BotaoRemoverDocentesLayout = new javax.swing.GroupLayout(BotaoRemoverDocentes);
        BotaoRemoverDocentes.setLayout(BotaoRemoverDocentesLayout);
        BotaoRemoverDocentesLayout.setHorizontalGroup(
            BotaoRemoverDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverDocentesLayout.setVerticalGroup(
            BotaoRemoverDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverDocentesLayout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelSubmenu.add(BotaoRemoverDocentes);
        BotaoRemoverDocentes.setBounds(0, 50, 180, 0);

        BotaoRelatorioTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRelatorioTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoRelatorioTurmas(evt);
            }
        });
        BotaoRelatorioTurmas.setLayout(null);

        jLabel45.setBackground(new java.awt.Color(255, 102, 204));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoRelatorioTurmas.add(jLabel45);
        jLabel45.setBounds(20, 0, 30, 50);

        jLabel46.setBackground(new java.awt.Color(105, 160, 115));
        jLabel46.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("             Turmas");
        jLabel46.setOpaque(true);
        BotaoRelatorioTurmas.add(jLabel46);
        jLabel46.setBounds(0, 0, 180, 50);

        PainelSubmenu.add(BotaoRelatorioTurmas);
        BotaoRelatorioTurmas.setBounds(0, 0, 180, 50);

        BotaoRelatorioDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRelatorioDocentes(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(105, 160, 115));
        jLabel47.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("             Docentes");
        jLabel47.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel47.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel47.setOpaque(true);

        javax.swing.GroupLayout BotaoRelatorioDocentesLayout = new javax.swing.GroupLayout(BotaoRelatorioDocentes);
        BotaoRelatorioDocentes.setLayout(BotaoRelatorioDocentesLayout);
        BotaoRelatorioDocentesLayout.setHorizontalGroup(
            BotaoRelatorioDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRelatorioDocentesLayout.setVerticalGroup(
            BotaoRelatorioDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRelatorioDocentesLayout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelSubmenu.add(BotaoRelatorioDocentes);
        BotaoRelatorioDocentes.setBounds(0, 50, 180, 0);

        BotaoRelatorioAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRelatorioAluno(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(105, 160, 115));
        jLabel48.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("             Alunos");
        jLabel48.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel48.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel48.setOpaque(true);

        javax.swing.GroupLayout BotaoRelatorioAlunoLayout = new javax.swing.GroupLayout(BotaoRelatorioAluno);
        BotaoRelatorioAluno.setLayout(BotaoRelatorioAlunoLayout);
        BotaoRelatorioAlunoLayout.setHorizontalGroup(
            BotaoRelatorioAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRelatorioAlunoLayout.setVerticalGroup(
            BotaoRelatorioAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRelatorioAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoRelatorioAluno);
        BotaoRelatorioAluno.setBounds(0, 100, 180, 0);

        BotaoRelatorioDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRelatorioDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRelatorioDisciplinasMouseClicked(evt);
            }
        });

        jLabel49.setBackground(new java.awt.Color(105, 160, 115));
        jLabel49.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("             Disciplinas ");
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49ClickBotaoDisciplinas(evt);
            }
        });

        javax.swing.GroupLayout BotaoRelatorioDisciplinasLayout = new javax.swing.GroupLayout(BotaoRelatorioDisciplinas);
        BotaoRelatorioDisciplinas.setLayout(BotaoRelatorioDisciplinasLayout);
        BotaoRelatorioDisciplinasLayout.setHorizontalGroup(
            BotaoRelatorioDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRelatorioDisciplinasLayout.setVerticalGroup(
            BotaoRelatorioDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRelatorioDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelSubmenu.add(BotaoRelatorioDisciplinas);
        BotaoRelatorioDisciplinas.setBounds(0, 150, 180, 50);

        TelaDocente.add(PainelSubmenu);
        PainelSubmenu.setBounds(30, 70, 180, 200);

        MiniTelas.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelas.setLayout(null);

        CadastrarDisciplina.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarDisciplina.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Nome da Disciplina");
        CadastrarDisciplina.add(jLabel19);
        jLabel19.setBounds(29, 37, 117, 20);
        CadastrarDisciplina.add(CaixaDeTextoDisciplina);
        CaixaDeTextoDisciplina.setBounds(29, 63, 117, 22);

        BotaoConcluirCadastroDisciplinas.setText("Cadastrar");
        BotaoConcluirCadastroDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroDisciplinasActionPerformed(evt);
            }
        });
        CadastrarDisciplina.add(BotaoConcluirCadastroDisciplinas);
        BotaoConcluirCadastroDisciplinas.setBounds(220, 420, 80, 23);

        ListaDeAlunos.setViewportView(listadealunos);

        CadastrarDisciplina.add(ListaDeAlunos);
        ListaDeAlunos.setBounds(30, 130, 224, 280);

        jScrollPane2.setViewportView(listadeprofessores);

        CadastrarDisciplina.add(jScrollPane2);
        jScrollPane2.setBounds(270, 130, 258, 280);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Professores Disponíveis");
        CadastrarDisciplina.add(jLabel23);
        jLabel23.setBounds(275, 103, 150, 20);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Alunos Disponíveis");
        CadastrarDisciplina.add(jLabel24);
        jLabel24.setBounds(29, 103, 130, 20);

        MiniTelas.add(CadastrarDisciplina);
        CadastrarDisciplina.setBounds(0, 0, 590, 470);

        CadastrarAluno.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarAluno.setPreferredSize(new java.awt.Dimension(520, 390));

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

        BotaoProcurarImagem3x4.setText("Adicionar Imagem.png (3x4)");
        BotaoProcurarImagem3x4.setActionCommand("Adicionar Imagem (3x4)");
        BotaoProcurarImagem3x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarImagem3x4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Data de Nascimento");

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

        EnderecoFotoAluno.setText(" ");

        TabelaDocumentosAnexados.setViewportView(ListaDocumentosAluno);

        try {
            CaixaDeTextoCadastroDataNascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Matrícula");

        javax.swing.GroupLayout CadastrarAlunoLayout = new javax.swing.GroupLayout(CadastrarAluno);
        CadastrarAluno.setLayout(CadastrarAlunoLayout);
        CadastrarAlunoLayout.setHorizontalGroup(
            CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarAlunoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CaixaDeTextoCadastroNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaixaDeTextoCadastroDataNascAluno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaixaDeTextoCadastroSenhaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CaixaDeTextoMatriculaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CaixaDeTextoCadastroUsuarioAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarAlunoLayout.createSequentialGroup()
                            .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EnderecoFotoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoProcurarImagem3x4))
                            .addGap(66, 66, 66))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarAlunoLayout.createSequentialGroup()
                            .addComponent(Moldura3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(112, 112, 112))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarAlunoLayout.createSequentialGroup()
                            .addComponent(TabelaDocumentosAnexados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)))
                    .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BotaoConcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoProcurarDocumentacao))))
        );
        CadastrarAlunoLayout.setVerticalGroup(
            CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(Moldura3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaDeTextoMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnderecoFotoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoProcurarImagem3x4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(CaixaDeTextoCadastroUsuarioAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TabelaDocumentosAnexados, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoProcurarDocumentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BotaoConcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        MiniTelas.add(CadastrarAluno);
        CadastrarAluno.setBounds(0, 0, 590, 470);

        CadastrarDocente.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarDocente.setPreferredSize(new java.awt.Dimension(520, 390));

        Moldura3x5.setLayout(null);

        Foto3x5.setBackground(new java.awt.Color(204, 204, 204));
        Foto3x5.setMaximumSize(new java.awt.Dimension(100, 125));
        Foto3x5.setMinimumSize(new java.awt.Dimension(100, 125));
        Foto3x5.setPreferredSize(new java.awt.Dimension(100, 125));
        Moldura3x5.add(Foto3x5);
        Foto3x5.setBounds(0, 0, 90, 125);

        jLabel30.setText("Nome");

        jLabel31.setText(" Usuario");

        jLabel32.setText("Senha");

        BotaoProcurarImagem3x5.setText("Adicionar Imagem.png (3x4)");
        BotaoProcurarImagem3x5.setActionCommand("Adicionar Imagem (3x4)");
        BotaoProcurarImagem3x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarImagem3x5ActionPerformed(evt);
            }
        });

        jLabel33.setText("Data de Nascimento");

        BotaoConcluirCadastro1.setText("Cadastrar");
        BotaoConcluirCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastro1ActionPerformed(evt);
            }
        });

        BotaoProcurarDocumentacao1.setText("Adiconar Documentação(até 10MB)");
        BotaoProcurarDocumentacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarDocumentacao1ActionPerformed(evt);
            }
        });

        EnderecoFotoDocente.setText(" ");

        TabelaDocumentosAnexados1.setViewportView(ListaDocumentosDocente);

        try {
            CaixaDeTextoCadastroDataNascDocente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel34.setText("Matrícula");

        javax.swing.GroupLayout CadastrarDocenteLayout = new javax.swing.GroupLayout(CadastrarDocente);
        CadastrarDocente.setLayout(CadastrarDocenteLayout);
        CadastrarDocenteLayout.setHorizontalGroup(
            CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CaixaDeTextoCadastroNomeDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaixaDeTextoCadastroDataNascDocente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel34)
                    .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaixaDeTextoCadastroSenhaDocente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CaixaDeTextoMatriculaDocente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CaixaDeTextoCadastroUsuarioDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarDocenteLayout.createSequentialGroup()
                        .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoProcurarImagem3x5)
                            .addComponent(EnderecoFotoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarDocenteLayout.createSequentialGroup()
                        .addComponent(BotaoConcluirCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarDocenteLayout.createSequentialGroup()
                        .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TabelaDocumentosAnexados1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoProcurarDocumentacao1))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarDocenteLayout.createSequentialGroup()
                        .addComponent(Moldura3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        CadastrarDocenteLayout.setVerticalGroup(
            CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroNomeDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroDataNascDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoMatriculaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroUsuarioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeTextoCadastroSenhaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                        .addComponent(Moldura3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnderecoFotoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProcurarImagem3x5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TabelaDocumentosAnexados1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoProcurarDocumentacao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoConcluirCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        MiniTelas.add(CadastrarDocente);
        CadastrarDocente.setBounds(0, 0, 590, 470);

        CadastrarTurma.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarTurma.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nome da Turma:");
        CadastrarTurma.add(jLabel10);
        jLabel10.setBounds(20, 40, 110, 20);
        CadastrarTurma.add(CaixaDeTextoCadastroTurma);
        CaixaDeTextoCadastroTurma.setBounds(20, 70, 140, 22);

        jScrollPane3.setViewportView(ListaDisciplinas);

        CadastrarTurma.add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 230, 240);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Disciplinas Disponiveis");
        CadastrarTurma.add(jLabel12);
        jLabel12.setBounds(20, 130, 160, 20);

        jButton3.setText("Cadastrar");
        CadastrarTurma.add(jButton3);
        jButton3.setBounds(90, 420, 80, 23);

        MiniTelas.add(CadastrarTurma);
        CadastrarTurma.setBounds(-1, -1, 590, 470);

        jPanel9.setBackground(new java.awt.Color(228, 255, 255));

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        MiniTelas.add(jPanel9);
        jPanel9.setBounds(0, 0, 590, 470);

        DisciplinasBusca.setBackground(new java.awt.Color(228, 255, 255));

        TabelaDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplinas", "Nº de Alunos", "Nº de professores", "Carga horária(semanal) "
            }
        ));
        TabelaDisc.setViewportView(TabelaDisciplinas);

        BotaoTecEletro.setText("Técnico em Eletromecânica");
        BotaoTecEletro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoTecEletroMouseClicked(evt);
            }
        });

        BotaoTecInfo.setText("Técnico em Informatica");
        BotaoTecInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoTecInfoMouseClicked(evt);
            }
        });

        AnoTurmaDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º Ano", "2º Ano", "3º Ano", "4º Ano" }));

        jLabel13.setText("Ano");

        BotaoProcurarDisciplinas.setText("Procurar");
        BotaoProcurarDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoProcurarDisciplinasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DisciplinasBuscaLayout = new javax.swing.GroupLayout(DisciplinasBusca);
        DisciplinasBusca.setLayout(DisciplinasBuscaLayout);
        DisciplinasBuscaLayout.setHorizontalGroup(
            DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                .addGroup(DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                                .addComponent(BotaoTecEletro)
                                .addGap(12, 12, 12)
                                .addComponent(BotaoTecInfo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnoTurmaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(BotaoProcurarDisciplinas)))))
                .addGap(16, 16, 16))
        );
        DisciplinasBuscaLayout.setVerticalGroup(
            DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisciplinasBuscaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoTecEletro)
                    .addComponent(BotaoTecInfo)
                    .addGroup(DisciplinasBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(AnoTurmaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BotaoProcurarDisciplinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        MiniTelas.add(DisciplinasBusca);
        DisciplinasBusca.setBounds(0, 0, 590, 470);

        MiniTelaDocentes.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelaDocentes.setMinimumSize(new java.awt.Dimension(510, 460));

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
                .addContainerGap(90, Short.MAX_VALUE))
        );
        MiniTelaDocentesLayout.setVerticalGroup(
            MiniTelaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiniTelaDocentesLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
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
        MiniTelaDocentes.setBounds(0, 0, 590, 470);

        TelaDocente.add(MiniTelas);
        MiniTelas.setBounds(210, 70, 590, 470);

        BotaoSair.setText("SAIR");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        TelaDocente.add(BotaoSair);
        BotaoSair.setBounds(720, 570, 72, 23);

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

        jLabel17.setText("Nome:");

        jLabel20.setText("Curso:");

        jLabel21.setText("Data de Nascimento:");

        jLabel22.setText("Ano Letivo:");

        EditarDadosPessoais.setText("Editar");
        EditarDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDadosPessoaisActionPerformed(evt);
            }
        });

        jPanel8.setMaximumSize(new java.awt.Dimension(90, 125));
        jPanel8.setMinimumSize(new java.awt.Dimension(90, 125));
        jPanel8.setPreferredSize(new java.awt.Dimension(90, 125));
        jPanel8.setLayout(null);
        jPanel8.add(FotoDadosPessoais);
        FotoDadosPessoais.setBounds(0, 0, 90, 123);

        NomeDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NomeDoAluno.setText("a");

        CursoDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CursoDoAluno.setText("a");

        DataNascDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        DataNascDoAluno.setText("s");

        AnoLetivoDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        AnoLetivoDoAluno.setText("a");

        javax.swing.GroupLayout MiniTelaDadosPessoaisLayout = new javax.swing.GroupLayout(MiniTelaDadosPessoais);
        MiniTelaDadosPessoais.setLayout(MiniTelaDadosPessoaisLayout);
        MiniTelaDadosPessoaisLayout.setHorizontalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DataNascDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CursoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoLetivoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(EditarDadosPessoais)))
                .addContainerGap())
        );
        MiniTelaDadosPessoaisLayout.setVerticalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataNascDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CursoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoLetivoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149)
                .addComponent(EditarDadosPessoais))
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
        if (loginUsuario.getText() == null) {
            loginUsuario.setText("Usúario");
        }
        if (loginSenha.getText() == null) {
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
        
        if ((Username.contains("abc") || Username.equals(usuario))
                && (Password.contains("123") || Password.equals(senha))) {
            loginUsuario.setText(null);
            loginSenha.setText(null);
            TelaLogin.setVisible(false);
            TelaEstudante.setVisible(true);
            
        }
        if (Username.contains("def") && Password.contains("456")) {//Procurar na lista de Professores
            loginUsuario.setText(null);
            loginSenha.setText(null);
            TelaLogin.setVisible(false);
            
            TelaDocente.setVisible(true);
            LimparMiniTela();
            PainelSubmenu.setVisible(false);
            
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    private void LimparMiniTela() {    
        CadastrarAluno.setVisible(false);
        MiniTelaDocentes.setVisible(false);
        MiniTelaDadosPessoais.setVisible(false);
        MiniTelaBoletim.setVisible(false);
        CadastrarDisciplina.setVisible(false);
        CadastrarTurma.setVisible(false);
        MiniTelaDocentes.setVisible(false);
        jPanel9.setVisible(false);
        DisciplinasBusca.setVisible(false);
        CadastrarDocente.setVisible(false);
    }
    private void LimparCaixasDeTextos(){ 
      CaixaDeTextoCadastroNomeDocente.setText(null);
      CaixaDeTextoCadastroDataNascDocente.setText(null);
      CaixaDeTextoMatriculaDocente.setText(null);
     CaixaDeTextoCadastroUsuarioDocente.setText(null);
     CaixaDeTextoCadastroSenhaDocente.setText(null);
     ListaDocumentosDocente.setText(null);
     EnderecoFotoDocente.setText(null);
    
    CaixaDeTextoCadastroNomeAluno.setText(null);
      CaixaDeTextoCadastroDataNascAluno.setText(null);
      CaixaDeTextoMatriculaAluno.setText(null);
     CaixaDeTextoCadastroUsuarioAluno.setText(null);
     CaixaDeTextoCadastroSenhaAluno.setText(null);
     ListaDocumentosAluno.setText(null);
     EnderecoFotoAluno.setText(null);
     
     CaixaDeTextoCadastroTurma.setText(null);
     CaixaDeTextoDisciplina.setText(null);
        
    }
  
    private void BotaoSairTelaLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairTelaLogin
        System.exit(0);
    }//GEN-LAST:event_BotaoSairTelaLogin

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        TelaDocente.setVisible(false);
        TelaLogin.setVisible(true);
       
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void loginSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginSenhaKeyPressed
        getRootPane().setDefaultButton(jButton1);
    }//GEN-LAST:event_loginSenhaKeyPressed

    private void ClickNoBotaoBoletim(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoBoletim
        LimparMiniTela();
        LimparCaixasDeTextos();
        MiniTelaBoletim.setVisible(true);

    }//GEN-LAST:event_ClickNoBotaoBoletim

    private void ClickBotaoDadosPessoais(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDadosPessoais
        LimparMiniTela();
        LimparCaixasDeTextos();
        MiniTelaDadosPessoais.setVisible(true);
    }//GEN-LAST:event_ClickBotaoDadosPessoais

    private void EditarDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDadosPessoaisActionPerformed

    }//GEN-LAST:event_EditarDadosPessoaisActionPerformed

    private void BotaoSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSair1ActionPerformed
        TelaEstudante.setVisible(false);
        TelaLogin.setVisible(true);// TODO add your handling code here:
        LimparTabelaDisciplinas();
    }//GEN-LAST:event_BotaoSair1ActionPerformed

    private void BotaoProcurarDocumentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarDocumentacaoActionPerformed
        JFileChooser arquivo = new JFileChooser();
        int op = arquivo.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File file = new File("");
            file = arquivo.getSelectedFile();
            String nomedoarquivo = file.getName();
            ListaDocumentosAluno.setText(nomedoarquivo);

    }//GEN-LAST:event_BotaoProcurarDocumentacaoActionPerformed
    }

    private void BotaoConcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroActionPerformed
        String nome = CaixaDeTextoCadastroNomeAluno.getText();
        String data = CaixaDeTextoCadastroDataNascAluno.getText();
        
        usuario = CaixaDeTextoCadastroUsuarioAluno.getText();
        senha = CaixaDeTextoCadastroSenhaAluno.getText();

        //FotoDadosPessoais.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(FotoDadosPessoais.getWidth(), FotoDadosPessoais.getHeight(), Image.SCALE_DEFAULT)));
        NomeDoAluno.setText(CaixaDeTextoCadastroNomeAluno.getText());
        DataNascDoAluno.setText(CaixaDeTextoCadastroDataNascAluno.getText());
       
 
        nomesdealunos = CaixaDeTextoCadastroNomeAluno.getText();
        for (int i = 0; i < nomesAlunos.length; i++) {
            
            if (nomesAlunos[i] == null) {
                nomesAlunos[i] = nomesdealunos;
                listadealunos.setListData(nomesAlunos);                
                break;                
            }
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado");
    }//GEN-LAST:event_BotaoConcluirCadastroActionPerformed

    private void BotaoProcurarImagem3x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarImagem3x4ActionPerformed
        JFileChooser arquivofoto = new JFileChooser();
        int op = arquivofoto.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File file = new File("");
            file = arquivofoto.getSelectedFile();
            endereco = file.getAbsolutePath();
            
            imagem = new ImageIcon(file.getPath());
            EnderecoFotoAluno.setText(endereco);
            Foto3x4.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(Foto3x4.getWidth(), Foto3x4.getHeight(), Image.SCALE_DEFAULT)));
            
        }
    }//GEN-LAST:event_BotaoProcurarImagem3x4ActionPerformed

    private void BotaoProcurarDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoProcurarDisciplinasMouseClicked
        DefaultTableModel dtmDisciplinas = (DefaultTableModel) TabelaDisciplinas.getModel();
        
        if (((DefaultTableModel) TabelaDisciplinas.getModel()).getRowCount() > 0) {
            for (int i = 0; i < TabelaDisciplinas.getRowCount(); i++) {
                ((DefaultTableModel) TabelaDisciplinas.getModel()).removeRow(i);
            }
        }
        
        if (BotaoTecEletro.isSelected()) {
            //usar o comando this. para cada atributo de disciplina(qtd de alunos, caga horaria,etc.)
            if (AnoTurmaDisciplina.getSelectedItem() == "2º Ano") {
                dtmDisciplinas.addRow(new String[]{"Geografia", "12", "2", "4 horas"});
                dtmDisciplinas.addRow(new String[]{"Matemática", "18", "4", "5 horas"});
    }//GEN-LAST:event_BotaoProcurarDisciplinasMouseClicked
        }
        if (BotaoTecInfo.isSelected()) {
            if (AnoTurmaDisciplina.getSelectedItem() == "3º Ano") {
                dtmDisciplinas.addRow(new String[]{"Inglês", "25", "1", "2 horas"});
                dtmDisciplinas.addRow(new String[]{"Filosofia", "15", "3", "1 horas"});
            }
        }
    }
    private void BotaoTecEletroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoTecEletroMouseClicked
        BotaoTecInfo.setSelected(false);
    }//GEN-LAST:event_BotaoTecEletroMouseClicked

    private void BotaoTecInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoTecInfoMouseClicked
        BotaoTecEletro.setSelected(false);
    }//GEN-LAST:event_BotaoTecInfoMouseClicked

    private void ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDisciplinas
        LimparMiniTela();
        LimparCaixasDeTextos();
        LimparTabelaDisciplinas();
        CadastrarDisciplina.setVisible(true);
        DisciplinasBusca.setVisible(false);
    }//GEN-LAST:event_ClickBotaoDisciplinas

    private void ClickBotaoCadastrarAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoCadastrarAluno
        LimparMiniTela();
        LimparCaixasDeTextos();
        CadastrarAluno.setVisible(true);
        LimparTabelaDisciplinas();
        
    }//GEN-LAST:event_ClickBotaoCadastrarAluno

    private void ClickNoBotaoCadastrarTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoCadastrarTurmas
        LimparMiniTela();
        jPanel9.setVisible(false);
        CadastrarTurma.setVisible(true);
        
        LimparTabelaDisciplinas();
    }//GEN-LAST:event_ClickNoBotaoCadastrarTurmas

    private void ClickBotaoCadastrarDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoCadastrarDocentes
        LimparMiniTela();
        LimparCaixasDeTextos();
        LimparTabelaDisciplinas();   
      CadastrarDocente.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoCadastrarDocentes

    private void DeslizarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizarMenuMouseClicked
        
        if (PainelSubmenu.getSize().getHeight() == 200 && PainelSubmenu.getSize().getWidth() == 180) {            
            if (jPanel3.getSize().getHeight() == 330 && jPanel3.getSize().getWidth() == 180) {
                
                Thread th = new Thread() {
                    
                    @Override
                    public void run() {
                        try {
                            for (int i = 180; i >= 0; i--) {
                                Thread.sleep(0, 05);
                                PainelSubmenu.setSize(i, 200);
                                jPanel3.setSize(i, 330);
                            }
                        } catch (InterruptedException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
    }//GEN-LAST:event_DeslizarMenuMouseClicked
        ;
                th.start();
                x = 0;
                
            }
        }
        if (PainelSubmenu.getSize().getHeight() == 200 && PainelSubmenu.getSize().getWidth() < 180) {
            if (jPanel3.getSize().getHeight() == 330 && jPanel3.getSize().getWidth() < 180) {
                Thread th = new Thread() {
                    
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i <= 180; i++) {
                                Thread.sleep(0, 05);
                                PainelSubmenu.setSize(i, 200);
                                jPanel3.setSize(i, 330);
                            }
                        } catch (InterruptedException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                x = 210;
            }
        }
    }    
    
    private void BotaoConcluirCadastroDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroDisciplinasActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro realizado");
       
        nomesdedisciplinas = CaixaDeTextoDisciplina.getText();
        for (int i = 0; i <nomesDisciplinas.length; i++) {
            if (nomesDisciplinas[i] == null) {
                nomesDisciplinas[i] = nomesdedisciplinas;
                ListaDisciplinas.setListData(nomesDisciplinas);                
                break;                
            }
 CaixaDeTextoDisciplina.setText(null);
       
        }        
        
    }//GEN-LAST:event_BotaoConcluirCadastroDisciplinasActionPerformed

    private void ClickNoBotaoMenuCadastro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoMenuCadastro
        PainelMenu.setVisible(false);
        PainelSubmenu.setVisible(true);
    }//GEN-LAST:event_ClickNoBotaoMenuCadastro

    private void ClickBotaoMenuEditar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoMenuEditar
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoMenuEditar

    private void ClickBotaoMenuRemover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoMenuRemover
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoMenuRemover

    private void jLabel29ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29ClickBotaoDisciplinas
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29ClickBotaoDisciplinas

    private void BotaoCadastrarDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarDisciplinasMouseClicked
        LimparMiniTela();
        LimparCaixasDeTextos();
        CadastrarDisciplina.setVisible(true);
        DisciplinasBusca.setVisible(false);
    }//GEN-LAST:event_BotaoCadastrarDisciplinasMouseClicked

    private void BotaoProcurarImagem3x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarImagem3x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoProcurarImagem3x5ActionPerformed

    private void BotaoConcluirCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastro1ActionPerformed
      nomesDeDocentes = CaixaDeTextoCadastroNomeDocente.getText();
        for (int i = 0; i < nomesAlunos.length; i++) {
            
            if (nomesDocentes[i] == null) {
                nomesDocentes[i] = nomesDeDocentes;
                listadeprofessores.setListData(nomesDocentes);                
                break;                
            }
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado"); 
    }//GEN-LAST:event_BotaoConcluirCadastro1ActionPerformed
  
    private void BotaoProcurarDocumentacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarDocumentacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoProcurarDocumentacao1ActionPerformed

    private void ClickNoBotaoEditarTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoEditarTurmas
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickNoBotaoEditarTurmas

    private void ClickBotaoEditarDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarDocentes
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoEditarDocentes

    private void ClickBotaoEditarAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarAluno
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoEditarAluno

    private void jLabel39ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39ClickBotaoDisciplinas
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39ClickBotaoDisciplinas

    private void BotaoEditarDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEditarDisciplinasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEditarDisciplinasMouseClicked

    private void ClickNoBotaoRemoverTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoRemoverTurmas
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickNoBotaoRemoverTurmas

    private void ClickBotaoRemoverAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRemoverAluno
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoRemoverAluno

    private void jLabel43ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43ClickBotaoDisciplinas
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43ClickBotaoDisciplinas

    private void BotaoRemoverDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverDisciplinasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoRemoverDisciplinasMouseClicked

    private void ClickBotaoRemoverDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRemoverDocentes
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoRemoverDocentes

    private void ClickNoBotaoRelatorioTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoRelatorioTurmas
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickNoBotaoRelatorioTurmas

    private void ClickBotaoRelatorioDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRelatorioDocentes
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoRelatorioDocentes

    private void ClickBotaoRelatorioAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRelatorioAluno
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoRelatorioAluno

    private void jLabel49ClickBotaoDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49ClickBotaoDisciplinas
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49ClickBotaoDisciplinas

    private void BotaoRelatorioDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRelatorioDisciplinasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoRelatorioDisciplinasMouseClicked
    
    public void LimparTabelaDisciplinas() {
        BotaoTecEletro.setSelected(false);
        BotaoTecInfo.setSelected(false);
        if (((DefaultTableModel) TabelaDisciplinas.getModel()).getRowCount() > 0) {
            for (int i = 0; i < TabelaDisciplinas.getRowCount(); i++) {
                ((DefaultTableModel) TabelaDisciplinas.getModel()).removeRow(i);
            }
            
        }
        
    }
    
    public void MarcadorPressionado() {
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
    private javax.swing.JLabel AnoLetivoDoAluno;
    private javax.swing.JComboBox<String> AnoTurmaDisciplina;
    private javax.swing.JPanel BotaoBoletim;
    private javax.swing.JPanel BotaoCadastrarAluno;
    private javax.swing.JPanel BotaoCadastrarDisciplinas;
    private javax.swing.JPanel BotaoCadastrarDocentes;
    private javax.swing.JPanel BotaoCadastrarTurmas;
    private javax.swing.JButton BotaoConcluirCadastro;
    private javax.swing.JButton BotaoConcluirCadastro1;
    private javax.swing.JButton BotaoConcluirCadastroDisciplinas;
    private javax.swing.JPanel BotaoDadosPessoais;
    private javax.swing.JPanel BotaoEditarAluno;
    private javax.swing.JPanel BotaoEditarDisciplinas;
    private javax.swing.JPanel BotaoEditarDocentes;
    private javax.swing.JPanel BotaoEditarTurmas;
    private javax.swing.JPanel BotaoMenuCadastro;
    private javax.swing.JPanel BotaoMenuEditar;
    private javax.swing.JPanel BotaoMenuRelatorio;
    private javax.swing.JPanel BotaoMenuRemover;
    private javax.swing.JButton BotaoProcurarDisciplinas;
    private javax.swing.JButton BotaoProcurarDocumentacao;
    private javax.swing.JButton BotaoProcurarDocumentacao1;
    private javax.swing.JButton BotaoProcurarImagem3x4;
    private javax.swing.JButton BotaoProcurarImagem3x5;
    private javax.swing.JPanel BotaoRelatorioAluno;
    private javax.swing.JPanel BotaoRelatorioDisciplinas;
    private javax.swing.JPanel BotaoRelatorioDocentes;
    private javax.swing.JPanel BotaoRelatorioTurmas;
    private javax.swing.JPanel BotaoRemoverAluno;
    private javax.swing.JPanel BotaoRemoverDisciplinas;
    private javax.swing.JPanel BotaoRemoverDocentes;
    private javax.swing.JPanel BotaoRemoverTurmas;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoSair1;
    private javax.swing.JRadioButton BotaoTecEletro;
    private javax.swing.JRadioButton BotaoTecInfo;
    private javax.swing.JPanel CadastrarAluno;
    private javax.swing.JPanel CadastrarDisciplina;
    private javax.swing.JPanel CadastrarDocente;
    private javax.swing.JPanel CadastrarTurma;
    private javax.swing.JFormattedTextField CaixaDeTextoCadastroDataNascAluno;
    private javax.swing.JFormattedTextField CaixaDeTextoCadastroDataNascDocente;
    private javax.swing.JTextField CaixaDeTextoCadastroNomeAluno;
    private javax.swing.JTextField CaixaDeTextoCadastroNomeDocente;
    private javax.swing.JTextField CaixaDeTextoCadastroSenhaAluno;
    private javax.swing.JTextField CaixaDeTextoCadastroSenhaDocente;
    private javax.swing.JTextField CaixaDeTextoCadastroTurma;
    private javax.swing.JTextField CaixaDeTextoCadastroUsuarioAluno;
    private javax.swing.JTextField CaixaDeTextoCadastroUsuarioDocente;
    private javax.swing.JTextField CaixaDeTextoDisciplina;
    private javax.swing.JTextField CaixaDeTextoMatriculaAluno;
    private javax.swing.JTextField CaixaDeTextoMatriculaDocente;
    private javax.swing.JLabel CursoDoAluno;
    private javax.swing.JLabel DataNascDoAluno;
    private javax.swing.JLabel DeslizarMenu;
    private javax.swing.JPanel DisciplinasBusca;
    private javax.swing.JButton EditarDadosPessoais;
    private javax.swing.JTextField EnderecoFotoAluno;
    private javax.swing.JTextField EnderecoFotoDocente;
    private javax.swing.JLabel Foto3x4;
    private javax.swing.JLabel Foto3x5;
    private javax.swing.JLabel FotoDadosPessoais;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel ImagemDeFundo;
    private javax.swing.JScrollPane ListaDeAlunos;
    private javax.swing.JList<String> ListaDisciplinas;
    private javax.swing.JTextPane ListaDocumentosAluno;
    private javax.swing.JTextPane ListaDocumentosDocente;
    private javax.swing.JPanel MiniTelaBoletim;
    private javax.swing.JPanel MiniTelaDadosPessoais;
    private javax.swing.JPanel MiniTelaDocentes;
    private javax.swing.JPanel MiniTelas;
    private javax.swing.JPanel MiniTelasAluno;
    private javax.swing.JPanel Moldura3x4;
    private javax.swing.JPanel Moldura3x5;
    private javax.swing.JLabel NomeDoAluno;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JPanel PainelSubmenu;
    private javax.swing.JScrollPane TabelaDisc;
    private javax.swing.JTable TabelaDisciplinas;
    private javax.swing.JScrollPane TabelaDoc;
    private javax.swing.JTable TabelaDocentes;
    private javax.swing.JScrollPane TabelaDocumentosAnexados;
    private javax.swing.JScrollPane TabelaDocumentosAnexados1;
    private javax.swing.JPanel TelaDocente;
    private javax.swing.JPanel TelaEstudante;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel Título;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JList<String> listadealunos;
    private javax.swing.JList<String> listadeprofessores;
    private javax.swing.JTextField loginSenha;
    private javax.swing.JTextField loginUsuario;
    // End of variables declaration//GEN-END:variables

    private void ClickMouseUsuario1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
