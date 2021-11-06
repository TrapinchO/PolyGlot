/*
 * Copyright (c) 2021, Draque Thompson, draquemail@gmail.com
 * All rights reserved.
 *
 * Licensed under: MIT License
 * See LICENSE.TXT included with this code to read the full license agreement.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.darisadesigns.polyglotlina.Desktop.CustomControls;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import org.darisadesigns.polyglotlina.Nodes.ConWord;

/**
 *
 * @author draque
 */
public class PListCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String tip = "";
        
        if (value instanceof ConWord conWord) {
            try {
                tip = conWord.getWordSummaryValue(true);
            } catch (Exception e) {
                // user is informed of this elsewhere. Simply default to stringified value
                tip = conWord.toString();
            }
        } else if (value != null) {
            tip = value.toString();
        }
        
        setToolTipText(tip);
        
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}
