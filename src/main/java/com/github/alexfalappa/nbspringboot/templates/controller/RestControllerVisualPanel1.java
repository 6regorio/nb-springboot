/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.templates.controller;

import javax.swing.JPanel;

import org.openide.WizardDescriptor;

import static com.github.alexfalappa.nbspringboot.templates.controller.RestControllerWizardIterator.WIZ_CRUD_METHODS;
import static com.github.alexfalappa.nbspringboot.templates.controller.RestControllerWizardIterator.WIZ_ERROR_HANDLING;

public final class RestControllerVisualPanel1 extends JPanel {

    private final RestControllerWizardPanel1 panel;

    @SuppressWarnings("LeakingThisInConstructor")
    public RestControllerVisualPanel1(RestControllerWizardPanel1 panel) {
        initComponents();
        this.panel = panel;
    }

    void store(WizardDescriptor wd) {
        wd.putProperty(WIZ_CRUD_METHODS, chCrud.isSelected());
        wd.putProperty(WIZ_ERROR_HANDLING, cbError.getSelectedIndex());
    }

    void read(WizardDescriptor wd) {
        chCrud.setSelected((Boolean) wd.getProperty(WIZ_CRUD_METHODS));
        cbError.setSelectedIndex((Integer) wd.getProperty(WIZ_ERROR_HANDLING));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chCrud = new javax.swing.JCheckBox();
        lError = new javax.swing.JLabel();
        cbError = new javax.swing.JComboBox<>();

        org.openide.awt.Mnemonics.setLocalizedText(chCrud, org.openide.util.NbBundle.getMessage(RestControllerVisualPanel1.class, "RestControllerVisualPanel1.chCrud.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lError, org.openide.util.NbBundle.getMessage(RestControllerVisualPanel1.class, "RestControllerVisualPanel1.lError.text")); // NOI18N

        cbError.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "HTTP status code (@ResponseStatus)", "HTTP status and custom error object" }));
        cbError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chCrud))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chCrud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lError))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbErrorActionPerformed
        // Notify that the panel changed
        panel.fireChangeEvent();
    }//GEN-LAST:event_cbErrorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbError;
    private javax.swing.JCheckBox chCrud;
    private javax.swing.JLabel lError;
    // End of variables declaration//GEN-END:variables

}
