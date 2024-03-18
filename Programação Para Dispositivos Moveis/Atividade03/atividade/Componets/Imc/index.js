import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';



// O componente IMC deve conter um formulário para inserção de peso (kg) e altura (m) do usuário,
//  além de um botão "Calcular IMC".



export default function Imc() {

    const [statusImc, setStatusImc] = useState('')
    const [peso, setPeso] = useState(0.0)
    const [altura, setAltura] = useState(0.0)
    const [imc, setImc] = useState(0.0)

    function calcular() {

        result = peso / (altura * altura)
        setImc(result)
        if (imc < 18,5) {
            setStatusImc('Baixo peso')
        } else if (imc < 24,99) {
            setStatusImc('Normal')
        } else if (imc < 29,99) {
            setStatusImc('Sobrepeso')
        } else if (imc > 30) {
            setStatusImc('Obesidade')
        } else {
            setStatusImc('')
        }


    }

    const handleChange = (event) => {
        setAltura(event.target.value);
       
      };
    const handleChangePeso = (event) => {
        setPeso(event.target.value);
    }


    return (
        <View style={styles.container}>
            <View style={styles.boxForm}>
                <Text style={styles.title}>Calcule seu IMC</Text>
                <View>
                    <Text style={styles.label}>Peso</Text>
                    <TextInput style={styles.input} placeholder='Digite seu peso' value={peso} onChange={handleChangePeso}  keyboardType='numeric' />
                </View>
                <View>
                    <Text style={styles.label}>Altura</Text>
                    <TextInput style={styles.input} placeholder='Digite sua altura' value={altura} onChange={handleChange} keyboardType='numeric' />
                </View>
                <Button onPress={calcular} title='Calcular' />
            </View>
            <View style={styles.boxResult}>
                <Text>{statusImc}</Text>
                <Text>{peso}</Text>
                <Text>{altura}</Text>
            </View>
            <StatusBar style="auto" />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    boxForm: {
        width: 400,
        height: 500,
        backgroundColor: '#282828',
        padding: 10,
        gap: 15
    }
});
