/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANestedFactor extends PFactor
{
    private TLparen _lparen_;
    private PExp _exp_;
    private TRparen _rparen_;

    public ANestedFactor()
    {
        // Constructor
    }

    public ANestedFactor(
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TRparen _rparen_)
    {
        // Constructor
        setLparen(_lparen_);

        setExp(_exp_);

        setRparen(_rparen_);

    }

    @Override
    public Object clone()
    {
        return new ANestedFactor(
            cloneNode(this._lparen_),
            cloneNode(this._exp_),
            cloneNode(this._rparen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANestedFactor(this);
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lparen_)
            + toString(this._exp_)
            + toString(this._rparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
