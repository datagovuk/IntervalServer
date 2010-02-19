/* CVS $UkId: $ */
package com.epimorphics.govData.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from ../../../../../../../../OntologyLibrary/purl.org/NET/scovo.ttl 
 * @author Auto-generated by schemagen on 16 Jan 2010 16:52 
 */
public class SCOVO {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/NET/scovo#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property dataset = m_model.createProperty( "http://purl.org/NET/scovo#dataset" );
    
    public static final Property datasetOf = m_model.createProperty( "http://purl.org/NET/scovo#datasetOf" );
    
    public static final Property dimension = m_model.createProperty( "http://purl.org/NET/scovo#dimension" );
    
    public static final Property max = m_model.createProperty( "http://purl.org/NET/scovo#max" );
    
    public static final Property min = m_model.createProperty( "http://purl.org/NET/scovo#min" );
    
    /** <p>a statistical dataset</p> */
    public static final Resource Dataset = m_model.createResource( "http://purl.org/NET/scovo#Dataset" );
    
    /** <p>a dimension of a statistical data item</p> */
    public static final Resource Dimension = m_model.createResource( "http://purl.org/NET/scovo#Dimension" );
    
    /** <p>a statistical data item</p> */
    public static final Resource Item = m_model.createResource( "http://purl.org/NET/scovo#Item" );
    
}
