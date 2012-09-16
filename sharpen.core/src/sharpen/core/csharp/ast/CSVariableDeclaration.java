/* Copyright (C) 2004 - 2008  Versant Inc.  http://www.db4o.com

This file is part of the sharpen open source java to c# translator.

sharpen is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

sharpen is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */

package sharpen.core.csharp.ast;

public class CSVariableDeclaration extends CSNode {
	
	private String _name;
	private CSTypeReferenceExpression _type;
	private CSExpression _initializer;
	private boolean _isParameter;
	
	public CSVariableDeclaration(String name, CSTypeReferenceExpression type) {
		this(name, type, null, false);
	}

    public CSVariableDeclaration(String name, CSTypeReferenceExpression type, CSExpression initializer) {
       this(name, type, initializer, false);
    }
    
	public CSVariableDeclaration(String name, CSTypeReferenceExpression type, CSExpression initializer, boolean isParameter) {
		_name = name;
		_type = type;
		_initializer = initializer;
		_isParameter = isParameter;
	}
	
	public void accept(CSVisitor visitor) {
		visitor.visit(this);
	}
	
	public boolean isParameter() {
	    return _isParameter;
	}

	public CSTypeReferenceExpression type() {
		return _type;
	}
	
	public void type(CSTypeReferenceExpression type) {
		_type = type;
	}
	
	public String name() {
		return _name;
	}
	
	public void initializer(CSExpression initializer) {
		_initializer = initializer;
	}
	
	public CSExpression initializer() {
		return _initializer;
	}

	public void name(String name) {
		_name = name;
	}
}