/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseATermExp(ATermExp node);
    void caseAAddExp(AAddExp node);
    void caseASubtExp(ASubtExp node);
    void caseAFactorTerm(AFactorTerm node);
    void caseATimesTerm(ATimesTerm node);
    void caseADivTerm(ADivTerm node);
    void caseANumFactor(ANumFactor node);
    void caseANestedFactor(ANestedFactor node);

    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTTimes(TTimes node);
    void caseTDiv(TDiv node);
    void caseTNumber(TNumber node);
    void caseTWhitespace(TWhitespace node);
    void caseEOF(EOF node);
}
