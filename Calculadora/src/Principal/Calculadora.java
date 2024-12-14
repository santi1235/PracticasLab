package Principal;

import javax.swing.JOptionPane;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Calculadora extends javax.swing.JFrame {

    double resultado = 0.0;
    String texto = "";
    boolean resultadoMostrado = false;
    
    public Calculadora() {
        initComponents();
        setSize(500,800);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private boolean validarParentesis(String expresion) {
        int balance = 0;
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            if (balance < 0) { // Más ')' que '('
                return false;
            }
        }
        return balance == 0; // Debe terminar balanceado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TextoResul = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Resultado = new javax.swing.JButton();
        Decimal = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        ParenteIzq = new javax.swing.JButton();
        ParenteDer = new javax.swing.JButton();
        Porcentaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoResul.setEditable(false);
        TextoResul.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TextoResul.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Limpiar.setText("AC");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Division.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Multiplicacion.setText("X");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        Resta.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Suma.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Resultado.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Resultado.setText("=");
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        Decimal.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Decimal.setText(".");
        Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecimalActionPerformed(evt);
            }
        });

        Num0.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num0.setText("0");
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });

        Num1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Num7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        Num8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Num9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        ParenteIzq.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        ParenteIzq.setText("(");
        ParenteIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParenteIzqActionPerformed(evt);
            }
        });

        ParenteDer.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        ParenteDer.setText(")");
        ParenteDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParenteDerActionPerformed(evt);
            }
        });

        Porcentaje.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Porcentaje.setText("%");
        Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(TextoResul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Limpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Division, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Multiplicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Resta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Suma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Resultado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Decimal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Num9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ParenteIzq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ParenteDer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Porcentaje, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoResul)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(ParenteIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ParenteDer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoResul, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParenteIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParenteDer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        TextoResul.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "/");
    }//GEN-LAST:event_DivisionActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "*");
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "-");
    }//GEN-LAST:event_RestaActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "+");
    }//GEN-LAST:event_SumaActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        texto = TextoResul.getText();
        try {
            // Validar que los paréntesis estén balanceados
            if (!validarParentesis(texto)) {
                JOptionPane.showMessageDialog(this, "Error: Los paréntesis no están balanceados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Reemplazar el porcentaje si es necesario
            texto = texto.replace("%", "/100");

            // Evaluar la expresión
            Expression e = new ExpressionBuilder(texto).build();
            double resultado = e.evaluate();
            TextoResul.setText(String.valueOf(resultado));

            resultadoMostrado = true; // Activar la bandera
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error en la expresión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ResultadoActionPerformed

    private void DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecimalActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + ".");
    }//GEN-LAST:event_DecimalActionPerformed

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "0");
    }//GEN-LAST:event_Num0ActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "1");
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "2");
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "3");
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "4");
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "5");
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "6");
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "7");
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "8");
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "9");
    }//GEN-LAST:event_Num9ActionPerformed

    private void ParenteIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParenteIzqActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        if (texto.isEmpty() || texto.endsWith("(") || texto.endsWith("+") || texto.endsWith("-") || texto.endsWith("*") || texto.endsWith("/")) {
            TextoResul.setText(texto + "(");
        }
    }//GEN-LAST:event_ParenteIzqActionPerformed

    private void ParenteDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParenteDerActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        if (texto.contains("(") && !texto.endsWith("(")) {
            TextoResul.setText(texto + ")");
        }
    }//GEN-LAST:event_ParenteDerActionPerformed

    private void PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeActionPerformed
        if (resultadoMostrado) {
            TextoResul.setText(""); // Limpiar el campo si se mostró un resultado
            resultadoMostrado = false; // Resetear la bandera
        }
        texto = TextoResul.getText();
        TextoResul.setText(texto + "%");
    }//GEN-LAST:event_PorcentajeActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decimal;
    private javax.swing.JButton Division;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton ParenteDer;
    private javax.swing.JButton ParenteIzq;
    private javax.swing.JButton Porcentaje;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Resultado;
    private javax.swing.JButton Suma;
    private javax.swing.JTextField TextoResul;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
