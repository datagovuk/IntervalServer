/* CVS $Id: $ */
package com.epimorphics.govData.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from ../../../../../resources/vocabulary/opmv.ttl 
 * @author Auto-generated by schemagen on 07 Jun 2010 11:39 
 */
public class OPMV {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/net/opmv/ns#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>used is an abstract property to express that a process used an artifact</p> */
    public static final Property used = m_model.createProperty( "http://purl.org/net/opmv/ns#used" );
    
    /** <p>wasControlledBy is an abstract property to express that a process was controlled 
     *  by an agent.</p>
     */
    public static final Property wasControlledBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasControlledBy" );
    
    /** <p>wasDerivedFrom is an abstract property to express that an artifact was derived 
     *  from another artifact.</p>
     */
    public static final Property wasDerivedFrom = m_model.createProperty( "http://purl.org/net/opmv/ns#wasDerivedFrom" );
    
    /** <p>wasEncodedBy is an object property to express that an artifact is encoded 
     *  by another artifact. It is useful to express the relationship between the 
     *  data and the file encoding the data.</p>
     */
    public static final Property wasEncodedBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasEncodedBy" );
    
    public static final Property wasEndedAt = m_model.createProperty( "http://purl.org/net/opmv/ns#wasEndedAt" );
    
    public static final Property wasGeneratedAt = m_model.createProperty( "http://purl.org/net/opmv/ns#wasGeneratedAt" );
    
    /** <p>wasGeneratedBy is an abstract property to express that an artifact was generated 
     *  by a process.</p>
     */
    public static final Property wasGeneratedBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasGeneratedBy" );
    
    /** <p>wasOperatedBy is an abstract property to express that an agent was operated 
     *  by another agent in the process that leads to the production of an artifact.</p>
     */
    public static final Property wasOperatedBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasOperatedBy" );
    
    public static final Property wasPerformedAt = m_model.createProperty( "http://purl.org/net/opmv/ns#wasPerformedAt" );
    
    /** <p>wasPerformedBy is an object property to express that a process was performed 
     *  by another process. It is a sub-property of wasControlledBy.</p>
     */
    public static final Property wasPerformedBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasPerformedBy" );
    
    public static final Property wasStartedAt = m_model.createProperty( "http://purl.org/net/opmv/ns#wasStartedAt" );
    
    /** <p>wasTriggeredBy is an abstract property to express that a process was triggerred 
     *  by another process.</p>
     */
    public static final Property wasTriggeredBy = m_model.createProperty( "http://purl.org/net/opmv/ns#wasTriggeredBy" );
    
    /** <p>Agent is a contextual entity acting as a catalyst of a process, enabling, 
     *  facilitating, controlling, or affecting its execution.</p>
     */
    public static final Resource Agent = m_model.createResource( "http://purl.org/net/opmv/ns#Agent" );
    
    /** <p>Artifact is a general concept that represents immutable piece of state, which 
     *  may have a physical embodiment in a physical object, or a digital representation 
     *  in a computer system.</p>
     */
    public static final Resource Artifact = m_model.createResource( "http://purl.org/net/opmv/ns#Artifact" );
    
    /** <p>Process refers to an action or series of actions performed on or caused by 
     *  artifacts, and resulting in new artifacts.</p>
     */
    public static final Resource Process = m_model.createResource( "http://purl.org/net/opmv/ns#Process" );
    
}
