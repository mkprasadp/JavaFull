import React, { useEffect, useState } from 'react'

const App = () => {
  const [message,setmessage] = useState();

  useEffect(()=>{
    fetch('https://javafull-production.up.railway.app').then(response=>response.text())
    .then(data=>setmessage(data))
  },[])

  return (
    <div style={{ textAlign: 'center', marginTop: '50px', color: 'red' }}>
      <h1>{message || 'Loading...'}</h1>
    </div>
  )
}

export default App
