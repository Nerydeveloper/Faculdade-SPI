import React from 'react';
import { ScrollView, View } from 'react-native';
import Signos, { Title } from './src/components/Signos';
import styles from './src/components/Signos/style';
import { useState } from 'react';
import Form from './src/components/Form';



export default function App() {

  //usar dentro do componente e antes do return
  


  const signos = [
    'ÁRIES',
    'TOURO',
    'GÊMEOS',
    'CÂNCER',
    'LEÃO',
    'VIRGEM',
    'LIBRA',

  ]
  return (
    <View style={styles.container}>
      <Title />
    

      <ScrollView showsVerticalScrollIndicator={false} style={{}}>
      

        {/* <Signos signos={signos[0]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[1]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[2]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[3]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[4]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[5]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[6]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[7]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[7]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[3]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[2]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[5]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[1]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[3]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[6]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[7]} dataInicio={'22/05'} dataFim={'21/06'} />
        <Signos signos={signos[4]} dataInicio={'22/05'} dataFim={'21/06'} /> */}
      <Form/>
      </ScrollView>

    </View>


  );
}


