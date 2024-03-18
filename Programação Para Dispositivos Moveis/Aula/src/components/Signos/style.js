import { StyleSheet } from 'react-native';


const styles = StyleSheet.create({
    container: {
        flex:1,
        backgroundColor: '#282828',
        width:'100%',
        alignContent:'center'
    
    },
    box:{
        width:'90%',
        borderColor:'#aaa',
        padding:10,
        borderWidth:1,
        marginBottom:10,
        justifyContent:'center',
        alignSelf:'center'
    },
    text:{
        color:'#ffffff'
    },
    boxTitle:{
        alignItems:'center',
        justifyContent:'center',
        height:50,
        backgroundColor:'#d2d2d2',
        marginBottom:10,
    },
    textTitle:{
        color:'green',
        fontSize:20,
        fontWeight:'bold',
        textTransform:'uppercase'
    },
    textInput:{
        width:400,
        height:40,
        borderWidth:2,
        borderColor:'red',
        padding:20,
        backgroundColor:'#fff',
        marginTop:10,
    }
});

export default styles;