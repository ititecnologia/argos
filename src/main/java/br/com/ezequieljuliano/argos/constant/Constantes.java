/*
 * Copyright 2012 Ezequiel Juliano Müller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.ezequieljuliano.argos.constant;

import br.com.ezequieljuliano.argos.config.Configuracoes;
import org.apache.lucene.util.Version;

/**
 *
 * @author Ezequiel Juliano Müller
 */
public class Constantes {

    //ÍNDICES DE DIRETÓRIOS
    private static final String DIRECTORY_INDEX = "/Index/";
    private static final String ROOT_FOLDER = "/Argos-Lucene/";
    
    //ÍNDICES PARA O LUCENE
    public static final String TUDO = "TUDO";
    public static final String INDICE_EVENTO_ID = "INDICE_EVENTO_ID";
    public static final String INDICE_EVENTO_MENSAGEM = "INDICE_EVENTO_MENSAGEM";
    public static final String INDICE_HOST_NAME = "INDICE_HOST_NAME";
    public static final String INDICE_HOST_USER = "INDICE_HOST_USER";
    public static final String INDICE_HOST_IP = "INDICE_HOST_IP";
    public static final String INDICE_FONTE = "INDICE_FONTE";
    public static final String INDICE_NOME = "INDICE_NOME";
    public static final String INDICE_OCORRENCIA_DTHR = "INDICE_OCORRENCIA_DTHR";
    public static final String INDICE_PALAVRAS_CHAVE = "INDICE_PALAVRAS_CHAVE";
    public static final String INDICE_ENTIDADE_ID = "INDICE_ENTIDADE_ID";
    public static final String INDICE_ENTIDADE_NOME = "INDICE_ENTIDADE_NOME";
    public static final String INDICE_ENTIDADE_CADASTRONACIONAL = "INDICE_ENTIDADE_CADASTRONACIONAL";
    public static final String INDICE_EVENTO_NIVEL_ID = "INDICE_EVENTO_NIVEL_ID";
    public static final String INDICE_EVENTO_NIVEL_DESCRICAO = "INDICE_EVENTO_NIVEL_DESCRICAO";
    public static final String INDICE_EVENTO_TIPO_ID = "INDICE_EVENTO_TIPO_ID";
    public static final String INDICE_EVENTO_TIPO_DESCRICAO = "INDICE_EVENTO_TIPO_DESCRICAO";

    public static String getIndexDirectory() {
        return getRootFolder() + DIRECTORY_INDEX;
    }

    public static String getRootFolder() {
        Configuracoes config;
        try {
            config = Configuracoes.load();
            return config.getLuceneIndices() + ROOT_FOLDER;
        } catch (Exception ex) {
            return ROOT_FOLDER;
        }
    }

    public static Version getVersion() {
        return Version.LUCENE_36;
    }
}