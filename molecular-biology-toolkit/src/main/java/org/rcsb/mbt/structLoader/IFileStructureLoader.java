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
package org.rcsb.mbt.structLoader;



import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.rcsb.mbt.model.Structure;


/**
 *  Defines the standard interface for classes which know how to load
 *  a Structure from a file or url object.
 *  <P>
 *  @author	John L. Moreland
 *  @see	org.rcsb.mbt.model.Structure
 *  @see	org.rcsb.mbt.structLoader.StructureFactory
 */
public interface IFileStructureLoader
	extends IStructureLoader
{
	/**
	 * Load a structure from a File object.
	 * @throws IOException 
	 */
	public Structure load( File file ) throws IOException;

	/**
	 * Returns true if the loader is capable of loading the structure,
	 * or false otherwise. This enables higher-level code to be able
	 * to automatically select or show the loaders that can
	 * load a given structure.
	 */
	public boolean canLoad( File file );

	/**
	 * Load a structure from a URL object.
	 * @throws IOException 
	 */
	public Structure load( URL url ) throws IOException;

	/**
	 * Returns true if the loader is capable of loading the structure,
	 * or false otherwise. This enables higher-level code to be able
	 * to automatically select or show the loaders that can
	 * load a given structure.
	 */
	public boolean canLoad( URL url );
}

