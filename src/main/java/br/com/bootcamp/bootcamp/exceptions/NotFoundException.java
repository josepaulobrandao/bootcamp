package br.com.bootcamp.bootcamp.exceptions;

import br.com.bootcamp.bootcamp.Util.MessageUtils;

public class NotFoundException  extends  RuntimeException{
    public NotFoundException () {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
