package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class ActivarPauta extends javax.swing.JFrame {
	private JButton btnCancelar;
	private JButton btnActivar;
	private JLabel lblSelPauta;
	private JComboBox cbxListaPautas;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ActivarPauta inst = new ActivarPauta();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ActivarPauta() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Activar Pauta");
			{
				lblSelPauta = new JLabel();
				getContentPane().add(lblSelPauta);
				lblSelPauta.setText("Seleccione la pauta:");
				lblSelPauta.setBounds(69, 33, 119, 16);
			}
			{
				btnActivar = new JButton();
				getContentPane().add(btnActivar);
				btnActivar.setText("Activar");
				btnActivar.setBounds(103, 81, 85, 23);
				btnActivar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						sistema.activarPauta(obtenerPautaSeleccionada());
					}

					private int obtenerPautaSeleccionada() {
						cbxListaPautas.getSelectedIndex();

						return null;
					}
				});
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				getContentPane().add(getCbxListaPautas());
				btnCancelar.setText("Cancelar");
				btnCancelar.setBounds(206, 81, 85, 23);
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						dispose();
					}
				});
			}
			pack();
			this.setSize(400, 178);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JComboBox getCbxListaPautas() {
		if (cbxListaPautas == null) {
			ComboBoxModel cbxListaPautasModel = new DefaultComboBoxModel(
					new String[] {});
			cbxListaPautas = new JComboBox();

			// Vector<PautaView> pautasDisponibles = sistema.obtenerPautas();
			// for (int i = 0; i < pautasDisponibles.size(); i++) {
			// cbxListaPautas.addItem(pautasDisponibles.elementAt(i));
			// }

			cbxListaPautas.setModel(cbxListaPautasModel);
			cbxListaPautas.setBounds(206, 30, 129, 23);
		}
		return cbxListaPautas;
	}

}