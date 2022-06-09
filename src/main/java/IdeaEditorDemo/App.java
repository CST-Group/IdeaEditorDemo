/*******************************************************************************
 * Copyright (c) 2022  DCA-FEEC-UNICAMP
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     R. R. Gudwin 
 ******************************************************************************/
package IdeaEditorDemo;

import br.unicamp.cst.representation.idea.Idea;
import br.unicamp.cst.util.viewer.representation.idea.IdeaEditor;
import javax.swing.WindowConstants;

public class App {
    public IdeaEditor ie;
    
    public App() {
        Idea root = new Idea("root",2);
        ie = new IdeaEditor(root,true);
        ie.setVisible(true);
        ie.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
            

    public static void main(String[] args) {
        App app = new App();
        while(app.ie.finished == false) {
            app.ie.validate();
        }
        System.exit(0);
    }
}
