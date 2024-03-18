import React, { useState } from 'react';
import {  Alert, Text, View,Button,TextInput } from 'react-native';
import styles from './style';


export default function Signos({ signos, dataInicio, dataFim }) {

    const [titulo,setTitulo] = useState("Botão")

    function mudarTitulo(){
        setTitulo("Olá mundo")
    }

    function idade(){
        const idadeNumerica = parseInt(titulo)
        if(idadeNumerica >= 18){
            alert("Maior de idade")
        } else {
            alert("Menor de idade")
        }
    }



{/* */}
    return (

        <View style={styles.box}>
            <Text style={styles.text}>Signo: {signos}</Text>
            <Text style={styles.text}>
                Inicio: {dataInicio}   Fim: {dataFim}
            </Text>
            <Button onPress={mudarTitulo} title={titulo}/>
            <Button onPress={() => alert('Nome: ' + titulo)} title={"Exibir nome"}/>
            {/* onchangeText é instananeo serve para atribuir funções tbm*/}
            <TextInput 
                style={styles.textInput}
                onChangeText={(values) => setTitulo(values)}
                placeholder='Fala tu'
            />
                
        </View>

    );
}
export function Title() {
    return (
        <View style={styles.boxTitle}>
            <Text style={styles.textTitle}>Adrian</Text>
        </View>
    );
}

