/*
 * BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence. This should
 * be distributed with the code. If you do not have a copy,
 * see:
 *
 * http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors. These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 * http://www.biojava.org/
 *
 * This code was contributed from the Molecular Biology Toolkit
 * (MBT) project at the University of California San Diego.
 *
 * Please reference J.L. Moreland, A.Gramada, O.V. Buzko, Qing
 * Zhang and P.E. Bourne 2005 The Molecular Biology Toolkit (MBT):
 * A Modular Platform for Developing Molecular Visualization
 * Applications. BMC Bioinformatics, 6:21.
 *
 * The MBT project was funded as part of the National Institutes
 * of Health PPG grant number 1-P01-GM63208 and its National
 * Institute of General Medical Sciences (NIGMS) division. Ongoing
 * development for the MBT project is managed by the RCSB
 * Protein Data Bank(http://www.pdb.org) and supported by funds
 * from the National Science Foundation (NSF), the National
 * Institute of General Medical Sciences (NIGMS), the Office of
 * Science, Department of Energy (DOE), the National Library of
 * Medicine (NLM), the National Cancer Institute (NCI), the
 * National Center for Research Resources (NCRR), the National
 * Institute of Biomedical Imaging and Bioengineering (NIBIB),
 * the National Institute of Neurological Disorders and Stroke
 * (NINDS), and the National Institute of Diabetes and Digestive
 * and Kidney Diseases (NIDDK).
 *
 * Created on 2007/02/08
 *
 */ 
package org.rcsb.vf.glscene.jogl;

// JOGL (OpenGL)
import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;

import com.jogamp.opengl.util.gl2.GLUT;


/**
 *  Provides a renderable object which contains all properties needed to
 *  regenerate geometry for a visible representation of some data. As the
 *  viewer processes incomming state change events from the tookit, the
 *  viewer sets dirty bit states in instances of this class so that during
 *  the next render pass, the viewer can quickly determine whether content
 *  needs to be update before it is redrawn. The "setDirty" and "getDisplayList"
 *  methods are synchronized to avoid test/set race conditions between the
 *  application thread and rendering thread.
 */
public class Renderable
{
	protected boolean dirty = true;


	/**
	 * Constructor with basic initialization (empty display list and dirty).
	 */
	public Renderable( ) { }


	/**
	 *  Set the dirty state to true (generally called by an application
	 *  to indicate that the display list should be re-generated).
	 */
	public synchronized final void setDirty( )
	{
		this.dirty = true;
	}


	/**
	 *  If the renderable is dirty, regenerate the display list and set the
	 *  dirty state to false, then return the display list. This method
	 *  must be overridden by a sub-class.
	 */
	public void draw( final GL gl, final GLU glu, final GLUT glut, final boolean isSelectionMode )
	{
		throw new UnsupportedOperationException( "Child must implement!" );
	}
	
	public void destroy(final GL gl, final GLU glu, final GLUT glut) {
		
	}
}

